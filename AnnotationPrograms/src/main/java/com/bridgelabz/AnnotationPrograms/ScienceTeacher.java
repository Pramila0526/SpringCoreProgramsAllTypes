package com.bridgelabz.AnnotationPrograms;
import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher {
	public void teach() {
		System.out.println("Hi. I am Your Science Teacher");
		System.out.println("My Name is Vinita");
	}
}
