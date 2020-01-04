package com.bridgelabz.SpringBeanScopeXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.springbeanscopexml.model.Message;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/bridgelabz/SpringBeanScopeXml/beans.xml");
        Message message = context.getBean("message",Message.class);
        message.setMessageId(1);
        message.setMessage("Hello");
        
        System.out.println("Message ID " +message.getMessageId());
        System.out.println("Message " +message.getMessage());
        
        Message message1 = context.getBean("message",Message.class);
        
        ((ClassPathXmlApplicationContext)context).close();
    }
}
