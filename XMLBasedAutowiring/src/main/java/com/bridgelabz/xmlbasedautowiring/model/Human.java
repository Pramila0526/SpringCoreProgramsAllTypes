package com.bridgelabz.xmlbasedautowiring.model;

public class Human // We have human object
{
	// Our job is to inject the object of this
	public Heart heart;// and another object is heart that is heart inside human
						// InnerBean

	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("Setter Method Called");
	}
	public Human(Heart heart) 
	{
		this.heart = heart;
	}
	public void start() {
		if (heart != null) {
			heart.pump();
		} else {
			System.out.println("Dead");
		}
	}
}
