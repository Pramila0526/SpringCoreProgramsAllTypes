package com.bridgelabz.spring;
import org.springframework.stereotype.Component;
/*******************************************************************************************
 * @author 	:Pramila Tawari
 * Purpose	:Engine Class
 * Date		:31/12/2019
 *
 ***************************************************************************************/
@Component
public class Engine {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Working";
	}
}
