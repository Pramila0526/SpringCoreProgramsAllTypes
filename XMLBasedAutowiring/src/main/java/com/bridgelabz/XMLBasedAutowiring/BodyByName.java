package com.bridgelabz.XMLBasedAutowiring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.bridgelabz.xmlbasedautowiring.model.Human;

public class BodyByName {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/bridgelabz/XMLBasedAutowiring/autowiringbyname.xml");
		Human human = (Human) context.getBean("human", Human.class);
		human.start();
		((ClassPathXmlApplicationContext)context).close();
	}
}
