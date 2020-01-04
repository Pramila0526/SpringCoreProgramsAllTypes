package com.bridgelabz.SpringXML;
import org.springframework.stereotype.Component;
/***************************************************************************************************
 * @author 	:Pramila Tawari
 * Purpose 	:CPU Class Implementing Device
 * Date		:31/12/2019
 *
 *****************************************************************************************************/
@Component
public class CPU implements Device{
	public void config()
	{
		System.out.println("M-TECHNO CPU Core i5 650 Processor, 8GB RAM & 1TB HDD with WiFi");
	}
}
