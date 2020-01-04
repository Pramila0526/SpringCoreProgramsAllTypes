package com.bridgelabz.annotationprograms.controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.bridgelabz.AnnotationPrograms.College;
import com.bridgelabz.annotationprograms.configurations.CollegeConfiguration;

public class Client {

	public static void main(String[] args) {
		// We are creating pure java application and not using xml file 
		// so here we are deleteing ClassPathXmlApplicationContext("bean.xml");
		// and putting AnnotationConfigApplicationContext()
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfiguration.class);
		College college = context.getBean("collegeBean",College.class);
		System.out.println("College Object created by spring" +college);
		college.test();
		((AnnotationConfigApplicationContext)context).close();
	}
}
