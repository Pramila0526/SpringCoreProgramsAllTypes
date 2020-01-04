package com.bridgelabz.springprograms.controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.bridgelabz.SpringPrograms.Sim;

public class Mobile2 {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
		System.out.println("Config Loaded");
		Sim sim =  context.getBean("sim",Sim.class);
		sim.calling();
		sim.data();
		((ClassPathXmlApplicationContext)context).close();
	}
}
