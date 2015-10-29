package OracleTutorials;

import java.lang.reflect.Method;


/*There are many bikes in the real world, all of the same make and model, and all built from the same set of blueprints.
In java, this blueprint is called a class. The new objects built based on the states and behaviors of a class would be
called instance of the class known as bicycles. */



class Bicycle {
	
	private int cadence = 0;	//instance variable
	private int speed = 0;		//instance variable
	private int gear = 1;		//instance variable
						
	void changeCadence(int newValue){	//method with int as parameter (this method must receive and int value when it is used.)
		cadence = newValue;				//way to change the instance variable (or state) of bicycle using a Method. This is encapsulation.
}
					
	void changeGear(int newValue){		//Notice the parameter name is the same here (cont..) 
		gear = newValue;				//When you define a variable in a method the scope is local, not global.
}

	void speedUp(int increment){
		speed = speed + increment;
	}
	
	void applyBreaks(int decrement){
		speed = speed - decrement;
	}
	
	void printStates(){
		System.out.println("Cadence is: " + cadence + "\nSpeed is: " + speed + "\nGear is: " + gear);
		System.out.println();
	 
	}
	
	
}
public class WhatIsAClass {
	
	public static void main(String[] args) {
		
		
		
		Bicycle bikeOne = new Bicycle();	//Creating an instance of the class object.	
		Bicycle bikeTwo = new Bicycle();	//Creating an instance of the class object.
	
		bikeOne.changeCadence(50);			//Calling the changeCadence method with the integer value of 50 as a parameter (cont..)
		bikeOne.speedUp(10);				//remember, the changeCadence method requires an int value to run, and it won't work without one.
		bikeOne.changeGear(2);
		bikeOne.printStates();				//the printStates method does not call for a method, and so it will run without one.
		
		bikeTwo.changeCadence(50);
		bikeTwo.speedUp(10);				//Speed is 10
		bikeTwo.changeGear(2);
		bikeTwo.changeCadence(40);
		bikeTwo.speedUp(10);				//Speed is now 20. This is because we are incrementing speedUp with it's previous value + its new value.
		bikeTwo.changeGear(3);
		bikeTwo.printStates();
		
		/*bikeOne.cadence = 5;*/			/*Won't work because the cadence instance variable is set to "private". Will receive a message saying, (cont...)
											  Bicycle.cadence is not visible. This is encapsulation. You must use the available method to change (cont..)
											  the variable.*/ 
	}

}