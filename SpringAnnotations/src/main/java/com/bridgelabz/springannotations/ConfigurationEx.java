package com.bridgelabz.springannotations;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/**************************************************************************************
 * @author 	:Pramila Tawari
 * Purpose	:Configuration Class
 * Date		:31/12/2019
 *
 **************************************************************************************/
@SuppressWarnings("unused")
@Configuration  // Specifies that this is the Configuration File for Every Object
@ComponentScan(basePackages="com.bridgelabz.springannotations")
public class ConfigurationEx {
	// As soon as you run the code it will fetch the object from here
	/*@Bean // This will return you a Bean ..this is the replacement of xml file
	public Mumbai getCity()
	{
		return new Mumbai();
	}
	
	@Bean
	public Government getProcess()
	{
		return new MaharshtraGov();
	}*/
	
	// It is Possible to run this without @Bean .
	// .we should Define @Component to the classes of which you want a Object
	// and Very important we should also add @ComponentScan(basePackages="Package Name") to the configuration class
}
