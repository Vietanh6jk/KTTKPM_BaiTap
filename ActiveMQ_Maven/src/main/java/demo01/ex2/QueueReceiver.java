package demo01.ex2;

import java.util.Properties;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;

import org.apache.log4j.BasicConfigurator;

public class QueueReceiver {
	public static void main(String[] args) throws Exception {
		// thiet lap bien moi truong cho JMS
		BasicConfigurator.configure();
		// thiet lap moi truong cho JJDNI
		Properties settings = new Properties();
		settings.setProperty(Context.INITIAL_CONTEXT_FACTORY, "org.apache.activemq.jndi.ActiveMQInitialContextFactory");
		settings.setProperty(Context.PROVIDER_URL, "tcp://localhost:61616");
		// tao context
		Context ctx = new InitialContext(settings);
		// lookup JMS connection factory
		Object obj = ctx.lookup("ConnectionFactory");
		ConnectionFactory factory = (ConnectionFactory) obj;
		// lookup JMS connection factory
		Destination destination = (Destination) ctx.lookup("dynamicQueues/vietanh");
		// tao connection
		Connection con = factory.createConnection("admin", "admin");
		// noi den MOM
		con.start();
		// tao session
		Session session = con.createSession(false, Session.CLIENT_ACKNOWLEDGE);
		// tao consumer
		MessageConsumer receiver = session.createConsumer(destination);
		System.out.println("Ty was lisented on queues.....");
		receiver.setMessageListener(new MessageListener() {

			public void onMessage(Message msg) {
				try {
					if (msg instanceof TextMessage) {
						TextMessage tm = (TextMessage) msg;
						String txt = tm.getText();
						System.out.println("Nhan duoc" + txt);
						msg.acknowledge();
					} else if (msg instanceof ObjectMessage) {
						ObjectMessage om = (ObjectMessage) msg;
						System.out.println(om);
					}
					//
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
