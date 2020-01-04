package com.bridgelabz.springannotations;
import java.util.Optional;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
/**************************************************************************************
 * @author 	:Pramila Tawari
 * Purpose	:News Channel implementing Government
 * Date		:31/12/2019
 *
 **************************************************************************************/
@SuppressWarnings("unused")
@Component
public class NewsChannels implements Government {

	public void process() {
		String[] str = new String[10];     
	      Optional<String> isNull = Optional.ofNullable(str[9]);        
	      if(isNull.isPresent()){     
	         //Getting the substring           
	         String str2 = str[9].substring(2, 5);          
	         //Displaying substring           
	         System.out.print("Substring is: "+ str2);       
	      }     
	      else{      
	         System.out.println("Cannot get the substring from an empty string");     
	      }                
	      str[9] = "  Mumbai's News";       
	      Optional<String> isNull2 = Optional.ofNullable(str[9]);       
	      if(isNull2.isPresent()){        
	         //Getting the substring            
	         String str2 = str[9];            
	         //Displaying substring           
	         System.out.print("City : "+ str2);          
	      }         
	      else{         
	         System.out.println("Cannot get the substring from an empty string");         
	      }    
		System.out.println(" from NEWS18,AAJ-TAK");
	}
}
