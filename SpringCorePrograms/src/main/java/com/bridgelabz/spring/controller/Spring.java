package com.bridgelabz.spring.controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.spring.Tyre;
/*******************************************************************************************
 * @author 	:Pramila Tawari
 * Purpose	:Implenatation of Tyre Class
 * Date		:31/12/2019
 *
 ***************************************************************************************/
public class Spring 
{
	@SuppressWarnings("resource")
    public static void main( String[] args )
    {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/bridgelabz/spring/springcore.xml");
    	
    	Tyre t=(Tyre) context.getBean("tyre");
    	System.out.println(t);
    }
}
