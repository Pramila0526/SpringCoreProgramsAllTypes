package com.bridgelabz.spring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/*******************************************************************************************
 * @author 	:Pramila Tawari
 * Purpose	:Car Class Implementing the Vehicle
 * Date		:31/12/2019
 *
 ***************************************************************************************/
@Component
public class Car implements Vehicle {
	@Autowired
	// For this class the 
	Engine engine;
	
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void drive()
	{
		System.out.println("Car " +engine);
	}
}
