package com.bridgelabz.springannotations.controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.springannotations.ConfigurationEx;
import com.bridgelabz.springannotations.Mumbai;
/**************************************************************************************
 * @author 	:Pramila Tawari
 * Purpose	:Spring Core Annotations
 * Date		:31/12/2019
 *
 **************************************************************************************/
public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// Mumbai mumbai = new Mumbai();
		// mumbai.config(); But this is not Dependency Injection
		// We Should Able to inject this object so we can ask our factory as below
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationEx.class);
		
		// Here we are asking factory to give you the object
		Mumbai mumbai = context.getBean(Mumbai.class);
		mumbai.config();
		//At the end it is giving you the error because we have multiple class with @Component
		//So we need to also define @Primary to the class which object you want
		
		// Instead of @primary we can also use @Qualifier("className") with the @AutoWired
		// So that we can get a Particulat @Component Class
	}
}
