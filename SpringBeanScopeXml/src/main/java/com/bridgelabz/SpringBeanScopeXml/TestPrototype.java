package com.bridgelabz.SpringBeanScopeXml;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.bridgelabz.springbeanscopexml.model.Restaurant;

public class TestPrototype {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bridgelabz/SpringBeanScopeXml/prototype.xml");
		Restaurant rest1 = context.getBean("restaurant",Restaurant.class);
		// First object implementation
		rest1.setWelcomeNote("Welcome to the Restaurant..!!");
		rest1.greetCustomer();
		
		// Second object implementation
		Restaurant rest2 = context.getBean("restaurant",Restaurant.class);
		rest2.greetCustomer();
		// It will give null because it is prototype bean scope so new object is going to implement
		// So it need its own setter implementation
		((ClassPathXmlApplicationContext)context).close();
	}
}

/* Prototype-
 * New Bean is created with every request or reference
 * */
