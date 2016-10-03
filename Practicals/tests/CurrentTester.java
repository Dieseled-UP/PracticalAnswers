package tests;

import practicalOne.Address;
import practicalOne.Date;
import practicalOne.Name;
import practicalTwo.Current;

public class CurrentTester {

	public static void main(String[] args) {

		Current currentOne = new Current(new Name("Mr", "Paddy", "Simpson"), 
				new Address("10", "Down The Road", "Letterkenny", "Donegal"), 
				100, 200, 
				new Date(4, 6, 1993));
		
		Current currentTwo = new Current(new Name("Mrs", "Susan", "Doyle"), 
				new Address("22", "Up The Road", "Letterkenny", "Donegal"), 
				500, 300, 
				new Date(23, 3, 1988));
		
		Current currentThree = new Current(new Name("Mr", "Paddy", "Simpson"), 
				new Address("10", "Down The Road", "Letterkenny", "Donegal"), 
				100, 200, 
				new Date(4, 6, 1993));
		
		System.out.println(currentOne.toString() + "\n");
		System.out.println(currentTwo.toString() + "\n");
		
		System.out.println("Current account Two's balance is: " + currentTwo.getBalance() + "\n");
		
		System.out.println("Current account One's overdraft is: " + currentOne.getOverdraft() + "\n");
		
		System.out.println(currentThree.equal(currentOne) + "\n");
		System.out.println(currentOne.equal(currentTwo) + "\n");
	}

}
