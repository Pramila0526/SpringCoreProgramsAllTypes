package com.bridgelabz.SpringBeanLifeCycle;

import java.sql.SQLException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.springbeanlifecycle.dao.Hello;
import com.bridgelabz.springbeanlifecycle.dao.StudentDao;

public class App {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/bridgelabz/SpringBeanLifeCycle/beans.xml");
		StudentDao student = context.getBean("studentDao", StudentDao.class);
		student.selectAllRows();
		Hello hello = context.getBean("hello", Hello.class);
		hello.display();
		((ClassPathXmlApplicationContext) context).close(); // Container Object Destroyed Now
	}
}
/*There are 3 Ways to Configure Bean Life Cycle Methods In Spring
 * 1) Annotation Approach
 * 2) XML Approach
 * 3) Implementing Interface
 * 
 * First and Second are most Recommonded
 */

//context.registerShutdownHook();  This is alternative for context.close();  

// registerShutdownHook() will execute once the main method ends. So once all your codes 
// get executed, it will be called & close your container, So it won't give us any exception.

// StudentDao student = new StudentDao();
// student.selectAllRows();
// student.deleteStudentRecord(3);

// In StudentDao Class we are writing dbConnections again and again with all the methods
// This is not a good coding format
// We are doing same things so creating and closing connection is common thing
// so move all these to a particular method so that we can reduce redundancy
// We hould use @PostConstruct so that we can call that particulat method for all methods


/* Application Context  (Super)  Interface
			|
			|
			|
   AbstractApplicationContext (Sub of Application Context)  Abstract Class
   			|
   			|
   			|
   ClassPathXmlApplicationContext (Sub class) Class    */











