package tests;

import practicalOne.Address;
import practicalOne.Date;
import practicalOne.Name;
import practicalTwo.Current;

public class CurrentTester {

	public static void main(String[] args) {

		Current currentOne = new Current(new Name("Mr", "Paddy", "Simpson"), 
				new Address("10", "Down The Road", "Letterkenny", "Donegal"), 
				100, 
				new Date(4, 6, 1993));
		
		Current currentTwo = new Current(new Name("Mrs", "Susan", "Doyle"), 
				new Address("22", "Up The Road", "Letterkenny", "Donegal"), 
				500, 
				new Date(23, 3, 1988));
		
		System.out.println(currentOne.toString());
		System.out.println(currentTwo.toString());
	}

}
