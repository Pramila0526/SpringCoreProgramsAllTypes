package com.bridgelabz.springannotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**************************************************************************************
 * @author 	:Pramila Tawari
 * Purpose	:Mumbai Class includes AutoWired and config() method
 * Date		:31/12/2019
 *
 **************************************************************************************/
@Component // Non Qualified and De Capitalized
public class Mumbai {
	@Autowired  //Inorder to connect all the objects it is by default byType it checks the type
	@Qualifier("newsChannels")
	Government government;
	
	public Government getGovernment() {
		return government;
	}
	public void setGovernment(Government government) {
		this.government = government;
	}
	public void config()
	{
		System.out.println("1000km Area,415413 Population,3526 IT Companies");
		government.process();
	}
}
