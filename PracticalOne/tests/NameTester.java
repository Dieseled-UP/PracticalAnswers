package tests;

import java.util.ArrayList;

import main.Name;

public class NameTester {

	public static void main(String[] args) {
		
		// Create an ArrayList of Name objects
		ArrayList<Name> names = new ArrayList<>();
		
		// There is two ways to add names to the ArrayList
		// First and quickest
		names.add(new Name("Mr", "Joe", "Doherty"));
		names.add(new Name("Miss", "Sue", "Gallagher"));
		names.add(new Name("Ms", "Cathy", "Miller"));
		names.add(new Name("Mr", "Joe", "Doherty"));
		
		/*
		// Second create the objects first
		Name nameOne = new Name("Mr", "Joe", "Doherty");
		Name nameTwo = new Name("Miss", "Sue", "Gallagher");
		Name nameThree = new Name("Ms", "Cathy", "Miller");
		// Add a name with the same details as the first
		Name nameFour = new Name("Mr", "Joe", "Doherty");
		
		// Then add to the List
		names.add(nameOne);
		names.add(nameTwo);
		names.add(nameThree);
		names.add(nameFour);*/
		
		// We will go with the first method for adding objects
		
		// Test toString method
		names.get(0).toString();
		
		// Test all getter and setter methods
		System.out.println(names.get(0).getTitle());
		System.out.println(names.get(1).getFirstName());
		System.out.println(names.get(2).getSurname());
		
		names.get(2).setFirstName("Patsy");
		System.out.println(names.get(2).getFirstName());
		
		names.get(1).setSurname("Bronx");
		System.out.println(names.get(1).getSurname());
		
		names.get(1).setTitle("Mrs");
		System.out.println(names.get(1).getTitle());
		
		// Test the equals method
		System.out.println(names.get(0).equal(names.get(3)));
		System.out.println(names.get(0).equal(names.get(1)));
		
		// Test the isFemale method
		System.out.println(Name.isFemale(names.get(1)));
		System.out.println(Name.isFemale(names.get(0)));
		
		// Test the nameSearch method
		System.out.println(nameSearch(names.get(2), names));
		
		Name newName = new Name("Mr", "Paddy", "Ferns");
		System.out.println(nameSearch(newName, names));
	}
	
	/**
	 * Method to check if a name is contained within an ArrayList
	 * @param name
	 * @param names
	 * @return boolean
	 */
	public static boolean nameSearch(Name name, ArrayList<Name> names) {
		
		return names.contains(name);
	}

}
