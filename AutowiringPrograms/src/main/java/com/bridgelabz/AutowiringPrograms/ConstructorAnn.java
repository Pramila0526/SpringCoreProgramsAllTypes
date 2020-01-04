package com.bridgelabz.AutowiringPrograms;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.bridgelabz.autowiringprograms.model.Human;

public class ConstructorAnn {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/bridgelabz/AutowiringPrograms/constructorann.xml");
		Human human = (Human) context.getBean("human", Human.class);
		human.start();
		((ClassPathXmlApplicationContext) context).close();
	}
}
