package com.bridgelabz.AnnotationPrograms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// Commenting the @Component because now we are going to work without @Component
// we are going to use @Bean in Configuration Class
@SuppressWarnings("deprecation")
@Component("collegeBean")
public class College {
	
	// @Value is use to inject Values for your primitive data types and string
	//@Value("Bridgelabz")  if you use @Value before the field then you dont need setter method 
	
	// There is also another way to define field name
	// create .properties file and define name and value there
	// then include the name in @Value Annotation as below
	// and add @PropertySource("classpath:info.properties") in the configuration file
	//@Value("${CollegeName}")  // the college name must be included so we can generate setter of that and give @Required
	                			// Put @Value("${CollegeName}") after @Required
	private String collegeName;
	
	
	@Autowired
	private Principal principal;
	
	// We have 2 teachers Math Teacher and Science Teacher
	// We can define a particular teacher which we wnt using @Qualifier
	@Autowired
    @Qualifier("scienceTeacher") //we can also do this by @Primary To the particular class we want
	private Teacher teacher;

	/*
	 * public College(Principal principal) 
	 * { this.principal = principal; }
	 */

	/*// If You are writing the @Autowired before the filed then you dont need setter  methods/
	@Autowired
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
		System.out.println("Using Teacher setter");
	}

 @Autowired
	public void setPrincipal(Principal principal) {
		this.principal = principal;
		System.out.println("Using Principal setter");
	}*/

	
	@Required
	@Value("${CollegeName}")
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public void test() {
		principal.principalInfo();
		teacher.teach();
		System.out.println("My College Name is " +collegeName);
		System.out.println("Testing College method");
	}
}
