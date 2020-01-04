package com.bridgelabz.spring.controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.bridgelabz.spring.Car;

public class AutoWiredTest {
	@SuppressWarnings("resource")
    public static void main( String[] args )
    {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/bridgelabz/spring/springcore.xml");
    	
		Car obj= (Car) context.getBean("car");
		obj.drive();
		// This is Annotation Based Configurations Where we are not using xml file
    }

}
