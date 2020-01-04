package com.bridgelabz.autowiringprograms.model;
import org.springframework.beans.factory.annotation.Autowired;
/*******************************************************************************************************
 * @author 	: Pramila Tawari
 * Purpose	: Human Class having dependency of Heart
 *
 *********************************************************************************************/
public class Human // We have human object
{
	// Our job is to inject the object of this
	public Heart heart;// and another object is heart that is heart inside human
						// InnerBean

	public Human()
	{
		
	}
	@Autowired   //autowired by constructor 
	public Human(Heart heart) 
	{
		this.heart = heart;
		System.out.println("Constructor is called");

	}
	
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("Setter Method Called");
	}
	
	public void start() {
		if (heart != null) {
			heart.pump();
		} else {
			System.out.println("Dead");
		}
	}
}
