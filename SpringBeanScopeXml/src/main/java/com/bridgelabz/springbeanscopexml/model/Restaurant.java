package com.bridgelabz.springbeanscopexml.model;

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
