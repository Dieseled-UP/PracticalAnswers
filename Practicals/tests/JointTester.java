package tests;

import practicalOne.Address;
import practicalOne.Date;
import practicalOne.Name;
import practicalTwo.Joint;

public class JointTester {

	public static void main(String[] args) {

		Joint jointOne = new Joint(new Name("Mr", "Paddy", "Simpson"), 
				new Name("Mrs", "Susan", "Doyle"), 
				new Address("22", "Up the Road", "Letterkenny", "Donegal"), 
				null, 
				500, 
				new Date(21, 10, 2001));
		
		System.out.println(jointOne.toString());
	}

}
