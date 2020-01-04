package com.bridgelabz.springprograms.controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.SpringPrograms.Airtel;

public class Mobile {
	public static void main(String[] args) {

		// Use IOC Container ApplicationContext
		// Container is going to read the config file and from that config file it will see whatever to create
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Config Loaded");
		Airtel airtel =  context.getBean("airtel",Airtel.class);
		airtel.calling();
		airtel.data();
		((ClassPathXmlApplicationContext)context).close();
	}
}

/* 1) Airtel airtel=new Airtel();
	airtel.calling();
	airtel.data();

 Next day if i want to change from airtel to vodafone then again i have to write 
 new code for Vodafone and remove prev code like below*/

/* 2) Vodafone vodafone=new Vodafone();
	vodafone.calling();
	vodafone.data();

 It is not good practice so we can do it by calling interface*/

/* 3) Sim sim=new Airtel();  // Now airtel specifing msg will called
	sim.calling();
	sim.data();

 In the above example if i want another sim then again we should change the Class and Source cod eis going to change again
 But right now we want to make this particular app Configurable 
 i.e. you dont need to change the source code the source cod eneed to be fixed*/
