
	/*Different types of objects often have many things in common with each other. For example, when we think of the bicycle,
	we could be talking about mountain bikes, tandem bikes, or road bikes. Each of these share characteristics with one another.
	Current speed, current pedal cadence, current gear. Each also have certain characteristics that make them unique from one another.
	Maximum top speed, types of handle bars, the number of seats. 
	
	Java allows you to take objects that can be easily grouped together into sub classes. Sub classes inherit the states and behaviors 
	of their super class. In our example, mountain bikes, tandem bikes, and road bikes would become the sub class of the class Bicycle.
	
	Bicycle would become the superclass of mountain bike, tande bike, and road bike - it would give them the already defined changeSpeed method,
	the already defined changeGear method, and the already defined changeCadence method. It would also give them the predefined default values that
	it holds for "int speed", "int cadence," and "int gear".
	
	To be use the Bicycle class, first we have to import it. You can see below how to do that on line 22 ("  import OracleTutorials.Bicycle;  "). 
	First you type the word "import" and then the name of the package you want to access, and then the name of the class you would like to import.
	
	To make a class a subclass of another, you use the keyword "extends" after your class declaration. 
	You can see below how to do that on line 24 ("  class MountainBike extends Bicycle  "). MountainBike now has all the states and behaviors of the
	superclass Bicycle. You can use these states and behaviors, and you can also create new ones specific to only class MountainBike. */ 



package OracleTutorials;
import OracleTutorials.Bicycle;		//importing the Bicycle class from "WhatIsAClass.java" which was the previous tutorial. 

class MountainBike extends Bicycle{		//Making MountainBike a sub class Bicycle. Bicycle is now a super class.  
	private String handleType;			//MountainBike will receive all the states and methods defined in Bicycle.
	

	void changeHandle(String handle){	//Creating a new method (behavior) that will allow me to access the private state "handle type". This method must receive a String parameter. 
		handleType = handle;			//Setting the private instance variable "handleType" equal to the parameter handle.
		System.out.println("Handle type: " + handleType);
			
	}
}
public class WhatIsInheritance {

	public static void main(String[] args) {
		
	MountainBike newBike = new MountainBike();	//Creating a new instance of the class MountainBike, a sub class of Bicycle.
	
	newBike.changeCadence(40);			//Using an inherited method (behavior) for the super class Bicycle.
	newBike.printStates();				//Using an inherited method (behavior) for the super class Bicycle. 
	newBike.changeHandle("Drop Bar");	//Using a method (behavior) that we created specifically for class MountainBike.
	
	
		
		
		
		

	}

}
