package com.bridgelabz.SpringBeanScopeXml;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.bridgelabz.springbeanscopexml.model.Restaurant;

public class TestSingleton {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bridgelabz/SpringBeanScopeXml/singleton.xml");
		Restaurant rest1 = context.getBean("restaurant",Restaurant.class);
		// First object implementation
		rest1.setWelcomeNote("Welcome to the Restaurant..!!");
		rest1.greetCustomer();
		
		// Second object implementation
		Restaurant rest2 = context.getBean("restaurant",Restaurant.class);
		rest2.greetCustomer();
		// Still it is going to give first object's Implementation
		((ClassPathXmlApplicationContext)context).close();
	 }
}

/* Singleton-
 * No matter how many calls you made to getBean. Spring Container returns 
 * only that one instance. It is not going to create new Instance every time. 
 * There is only one instance that is goine to hand over everytime to getBean
 * */
