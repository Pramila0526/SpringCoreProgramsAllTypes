package com.bridgelabz.AutowiringPrograms;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.autowiringprograms.model.Student;

public class SetterAnn {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/bridgelabz/AutowiringPrograms/setterann.xml");
		Student student = (Student) context.getBean("student", Student.class);
		student.startReading();
		((ClassPathXmlApplicationContext)context).close();
	}
}
