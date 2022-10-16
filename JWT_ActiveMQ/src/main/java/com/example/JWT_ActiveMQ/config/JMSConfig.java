package com.example.JWT_ActiveMQ.config;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;

@Configuration
@EnableJms
@ComponentScan(basePackages = "com.expample.JWT_ActivqMQ")
public class JMSConfig {
	private static final String BROKER_URL="tcp://localhost:61616";
	private static final String BROKER_USERNAME="admin";
	private static final String BROKER_PASSWORD = "admin";
	
	@Bean
	public ActiveMQConnectionFactory connectionFactory() {
		ActiveMQConnectionFactory connectionFactory= new ActiveMQConnectionFactory();
		connectionFactory.setBrokerURL(BROKER_URL);
		connectionFactory.setUserName(BROKER_USERNAME);
		connectionFactory.setPassword(BROKER_PASSWORD);
		return connectionFactory;
	}
	@Bean
	public JmsTemplate jmsTemplate() {
		JmsTemplate jmsTemplate= new JmsTemplate();
		jmsTemplate.setConnectionFactory(connectionFactory());
		return jmsTemplate;
	}
	
	@Bean
	public DefaultJmsListenerContainerFactory jmsListenerContainerFactory() {
		DefaultJmsListenerContainerFactory factory= new DefaultJmsListenerContainerFactory();
		factory.setConnectionFactory(connectionFactory());
		factory.setConcurrency("3-10");
		factory.setPubSubDomain(false);
		return factory;
	}
}
