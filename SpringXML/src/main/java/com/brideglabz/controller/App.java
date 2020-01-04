package com.brideglabz.controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.bridgelabz.SpringXML.CPU;
import com.bridgelabz.SpringXML.Device;
/***************************************************************************************************
 * @author 	:Pramila Tawari
 * Purpose 	:XML Based Configurations
 * Date		:31/12/2019
 *
 *****************************************************************************************************/
public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// Mumbai mumbai = new Mumbai();
		// mumbai.config(); But this is not Dependency Injection
		// We Should Able to inject this object so we can ask our factory as below
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/bridgelabz/SpringXML/springex.xml");
		
		// Here we are asking factory to give you the object
		Device dev = (CPU) factory.getBean("device");
		dev.config();
	}
}
