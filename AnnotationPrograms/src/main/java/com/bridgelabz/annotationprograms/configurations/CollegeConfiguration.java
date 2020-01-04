package com.bridgelabz.annotationprograms.configurations;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration 	// It is the replacement of xml file
  			   	// If we dont want to use xml at all then you can create a new java class for configurations
			  	// and give it annotation as @Configuration

@ComponentScan(basePackages = "com.bridgelabz.AnnotationPrograms") // It is for specifying the package name from which we want to fetch the objects of class
@PropertySource("classpath:info.properties")   // Path of properties file
public class CollegeConfiguration {
	
	/*@Bean
	public Teacher mathTeacherBean()
	{
		return new MathTeacher();
	}
	@Bean
	public Principal principalBean()
	{
		return new Principal();
	}
	// To make this method bean you need to expose @Bean as below
	// with using @Bean we dont need @ComponentScan(basePackages = "com.bridgelabz.AnnotationPrograms")
	@Bean
	public College collegeBean() // collegeBean() - Bean id
	{
		// College college = new College();
		// This is by using Constructor Injection
		// return new College(principalBean());
		
		// This is by using Setter Injection
		College college=new College();
		college.setPrincipal(principalBean());
		college.setTeacher(mathTeacherBean());
		return college;
	}*/
	
	// @Bean(name="colBean")   If you want to change the bean name you can
	// @Bean(name= {"colBean","collegeBean"}) We can also give multiple bean names
}
