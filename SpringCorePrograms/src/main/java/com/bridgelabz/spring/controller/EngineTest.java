package com.bridgelabz.spring.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.spring.Engine;

public class EngineTest 
{
	  @SuppressWarnings("resource")
	public static void main( String[] args )
	    {
			ApplicationContext context=new ClassPathXmlApplicationContext("com/bridgelabz/spring/springex.xml");
	    	
	    	Engine e=(Engine) context.getBean("engine");
	    	System.out.println(e);
	    }
}
