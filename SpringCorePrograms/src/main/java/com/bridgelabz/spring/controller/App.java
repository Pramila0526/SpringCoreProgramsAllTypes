package com.bridgelabz.spring.controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.spring.Vehicle;
/*****************************************************************************************
 * @author 	:Pramila Tawari
 * Purpose	:XML And Annotation Based Configurations
 * Date		:31/12/2019
 *
 ******************************************************************************************/
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	// Instance of Car-- Car car=new Car(); car.drive();
    	// Instance of Bike-- Bike bike=new Bike(); bike.drive();
    	
    	// If you update your classes you need to change the source code
    	// So it is depend upon the classes car and bike
    	// we need to make it in a way that it will not depend on the class car and bike
    	// So the Object should be Independent of these classes
    	// and to remove these dependencies we have the concept **DEPENDENCY INJECTION**
    	// Lets create an interface Vehicle
    	
    	// now here we have to use Spring Framework
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/bridgelabz/spring/springcore.xml");
    	// Whenever you call this context it will go to the defined XML File
    	
    	// getBean is a method which belongs to 2 interfaces 
    	// Interfaces--ApplicationFactory and BeanFactory
    	//ApplicationFactory is a Superset of BeanFactory
    	
    	// Xml Base Configurations -- 
    	// Vehicle vehobj=(Vehicle) context.getBean("vehicle");
    	// Error occurred because BeanFactory not initialized 
    	// We need to create xml file to read the data that we want
    	
    	// Annotation Based Configuration--
    	// Here we have to write the class name inside the getBean Method
    	// Define Car Class as a component
    	Vehicle vehobj=(Vehicle) context.getBean("car");
    	 
    	vehobj.drive();
    	
    	// So in this we have to change the xml file not to change the source code and 
    	// we are not recompiling it again 
    	
    }
}
