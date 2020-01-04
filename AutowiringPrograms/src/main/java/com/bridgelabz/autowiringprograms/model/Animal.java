package com.bridgelabz.autowiringprograms.model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
/*******************************************************************************************************
 * @author 	: Pramila Tawari
 * Purpose	: Animal Class having dependency of AnimalHaeart
 *
 *********************************************************************************************/
public class Animal // We have human object
{   @Autowired
	@Qualifier("tigerHeart") // to let Spring know which particulat object it need ti Inject
	public AnimalHeart animalHeart;

	public Animal() {

	}
    
	public Animal(AnimalHeart animalHeart) {
		this.animalHeart = animalHeart;
	}
	
	/* We can also call @Autowired and @Qualifier before setter but if you dont need this then do not call setter method
		So no nedd to write setter if you call @Autowire before dependency
		@Autowire Doest need setter to do the dependency injection
		Spring will directly create and inject the dependency if matched found
		
	public void setAnimalHeart(AnimalHeart animalHeart) {
		this.animalHeart = animalHeart;
		System.out.println("Setter of Animal Heart");
	}*/
	
	public void start() {
		if (animalHeart != null) {
			animalHeart.pump();
			System.out.println("Name Of the Animal is : "+animalHeart.getNameOfAnimal()+ "\nNumbar Of Hearts : " +animalHeart.getNoOfHearts());
		} else {
			System.out.println("No Animal");
		}
	}
}
