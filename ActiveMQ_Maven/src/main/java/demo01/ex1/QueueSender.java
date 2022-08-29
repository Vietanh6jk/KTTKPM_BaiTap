package demo01.ex1;

import java.util.Date;
import java.util.Properties;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.naming.Context;
import javax.naming.InitialContext;

import org.apache.log4j.BasicConfigurator;

import data.Person;
import helper.XMLContext;


public class QueueSender {
	public static void main(String[] args) throws Exception {
		//config enviroment for JMS 
		BasicConfigurator.configure();
		//config enviroment for JNDI
		Properties settings= new Properties();
		settings.setProperty(Context.INITIAL_CONTEXT_FACTORY, 
				"org.apache.activemq.jndi.ActiveMQInitialContextFactory");
		settings.setProperty(Context.PROVIDER_URL, "tcp://localhost:61616");
		//create context
		Context ctx =new InitialContext(settings);
		//lookup JMS connection factory 
		ConnectionFactory factory=
					(ConnectionFactory) ctx.lookup("ConnectionFactory");
		//lookup  destination.(IF not exits-->Active MQ create once)
		Destination destination=
					(Destination) ctx.lookup("dynamicQueues/vietanh");
		//get connection using credential
		Connection con= factory.createConnection("admin","admin");
		//connect to MOM
		con.start();
		//create session
		Session session=con.createSession(false, Session.AUTO_ACKNOWLEDGE);
		//create producer
		MessageProducer producer = session.createProducer(destination);
		//create text message 
		Message msg= session.createTextMessage("Hello message from activeMQ");
		producer.send(msg);
		
		Person p = new Person(19504781,"Nguyen Viet Anh",new Date());
		String xml=new XMLContext<Person>(p).Object2XML(p);
		
		msg=session.createTextMessage(xml);
		producer.send(msg);
		//shutdown connection
		session.close();
		con.close();
		System.out.println("Finished.....");
		
		
		
		}
}
