package com.bridgelabz.AutowiringPrograms;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.bridgelabz.autowiringprograms.model.Animal;

public class AnimalAnn {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/bridgelabz/AutowiringPrograms/animal.xml");
		Animal animal = (Animal) context.getBean("animal", Animal.class);
		animal.start();
		((ClassPathXmlApplicationContext) context).close();
	}
}