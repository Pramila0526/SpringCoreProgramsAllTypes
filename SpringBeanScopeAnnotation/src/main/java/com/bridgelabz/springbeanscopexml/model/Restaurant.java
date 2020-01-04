package com.bridgelabz.springbeanscopexml.model;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component  // Restaurant restaurant = new Restaurant();
// @Scope this is singleton by default
@Scope("prototype")
public class Restaurant {
	private String welcomeNote;

	public String getWelcomeNote() {
		return welcomeNote;
	}

	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}
	public void greetCustomer()
	{
		System.out.println(welcomeNote);
	}
}
