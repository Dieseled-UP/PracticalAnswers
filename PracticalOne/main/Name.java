package main;

public class Name {

	private String title;
	private String firstName;
	private String surname;
	
	/**
	 * @param title
	 * @param firstName
	 * @param surname
	 */
	public Name(String title, String firstName, String surname) {
		
		this.title = title;
		this.firstName = firstName;
		this.surname = surname;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	/**
	 * Method to compare two Name objects
	 * @param name
	 * @return boolean
	 */
	public boolean equal(Name name) {
		
		return name.title.equals(title) && name.firstName.equals(firstName) && name.surname.equals(surname);
	}
	
	/**
	 * Method to test if Name object is a female
	 * @param name
	 * @return boolean
	 */
	public static boolean isFemale(Name name) {
		
		return name.title.equalsIgnoreCase("miss") || name.title.equalsIgnoreCase("ms") || name.title.equalsIgnoreCase("mrs");
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Name [title=" + title + ", firstName=" + firstName + ", surname=" + surname + "]";
	}
	
}
