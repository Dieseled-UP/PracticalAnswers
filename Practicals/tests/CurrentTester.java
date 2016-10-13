package tests;

import java.util.ArrayList;

import practicalOne.Address;
import practicalOne.Date;
import practicalOne.Name;
import practicalTwo.Current;

public class CurrentTester {

	public static void main(String[] args) {

		// Create an ArrayList to hold our accounts
		ArrayList<Current> accounts = new ArrayList<>();

		// Create a few accounts
		Current currentOne = new Current(new Name("Mr", "Paddy", "Simpson"), new Address("10", "Down The Road", "Letterkenny", "Donegal"), 100, 200,
				new Date(4, 6, 1993));

		Current currentTwo = new Current(new Name("Mrs", "Susan", "Doyle"), new Address("22", "Up The Road", "Letterkenny", "Donegal"), 500, 300,
				new Date(23, 3, 1988));

		Current currentThree = new Current(new Name("Mr", "Oliver", "Doherty"), new Address("50", "The Side Road", "Ballybofey", "Donegal"), 100, 200,
				new Date(4, 6, 1993));

		Current currentFour = new Current(new Name("Mrs", "Jane", "Doe"), new Address("3", "The Back Road", "Carndonagh", "Donegal"), 500, 300,
				new Date(23, 3, 1988));

		// Add all accounts to the ArrayList
		accounts.add(currentOne);
		accounts.add(currentTwo);
		accounts.add(currentThree);
		accounts.add(currentFour);

		// Create separate account
		Current currentFive = new Current(new Name("Mr", "Paddy", "Simpson"), new Address("10", "Down The Road", "Letterkenny", "Donegal"), 100, 200,
				new Date(4, 6, 1993));

		// Test toString Method
		System.out.println(currentOne.toString() + "\n");
		System.out.println(currentTwo.toString() + "\n");

		System.out.println("Current account Two's balance is: " + currentTwo.getBalance() + "\n");

		System.out.println("Current account One's overdraft is: " + currentOne.getOverdraft() + "\n");

		// Test equals method
		System.out.println(currentFive.equal(currentOne) + "\n");
		System.out.println(currentOne.equal(currentTwo) + "\n");

		// Test the currentSearch method
		System.out.println(currentSearch(accounts, currentFour));
		System.out.println(currentSearch(accounts, currentFive));

		double amount = currentFive.withdraw(250);
		if (amount == 0) {

			System.out.println("Sorry you are broke");
		} else {
			System.out.println(amount);
		}

		System.out.println(currentFive.getBalance());
		System.out.println(currentFive.getOverdraft());

		currentFive.deposit(500);

		System.out.println(currentFive.getBalance());
		System.out.println(currentFive.getOverdraft());
	}

	/**
	 * Method to test if an account exists in an ArrayList
	 * 
	 * @param list
	 * @param account
	 * @return boolean
	 */
	public static boolean currentSearch(ArrayList<Current> list, Current account) {

		return list.contains(account);
	}

}
