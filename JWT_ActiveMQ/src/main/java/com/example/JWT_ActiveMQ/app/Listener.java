package com.example.JWT_ActiveMQ.app;

import java.util.Map;
import com.google.gson.Gson;

import javax.jms.JMSException;
import javax.jms.TextMessage;

import org.apache.activemq.command.Message;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class Listener {
	@JmsListener(destination = "inbound.queue")
	@SendTo("oubound.queue")
	public String receiveMessage(final Message jsonMessage) throws JMSException{
		String messageData= null;
		System.out.println("Tin nhắn nhận được" +jsonMessage);
		String response = null;
		if(jsonMessage instanceof TextMessage) {
			TextMessage message= (TextMessage) jsonMessage;
			
			messageData= message.getText();
			Map map = new Gson().fromJson(messageData, Map.class);
			response ="Chào" +map.get("name");
		}
		return response;
		
	}
}
