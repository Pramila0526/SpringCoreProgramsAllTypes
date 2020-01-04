package com.bridgelabz.AnnotationPrograms;
import org.springframework.stereotype.Component;

@Component
// @Primary It is used to make it Primary so that this class object will be called
public class MathTeacher implements Teacher {
	public void teach() {
		System.out.println("Hi. I am Your Math Teacher");
		System.out.println("My Name is Mali");
	}
}
