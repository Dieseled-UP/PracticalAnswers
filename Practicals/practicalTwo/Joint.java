package practicalTwo;

import practicalOne.Address;
import practicalOne.Date;
import practicalOne.Name;

public class Joint extends Account {

	// We will use composition to access the address and date objects
	private Name nameOne;
	private Name nameTwo;
	private Address address;
	private Date dateOpened;

	public Joint() {
		this(null, null, null, 0, null);
	}

	/**
	 * @param nameOne
	 * @param nameTwo
	 * @param addressOne
	 * @param addressTwo
	 * @param balance
	 * @param dateOpened
	 */
	public Joint(Name nameOne, Name nameTwo, Address address, double balance, Date dateOpened) {
		this.nameOne = nameOne;
		this.nameTwo = nameTwo;
		this.address = address;
		this.balance = balance;
		this.dateOpened = dateOpened;
	}

	/**
	 * @return the nameOne
	 */
	public Name getNameOne() {

		return nameOne;
	}

	/**
	 * @param nameOne
	 *            the nameOne to set
	 */
	public void setNameOne(Name nameOne) {

		this.nameOne = nameOne;
	}

	/**
	 * @return the nameTwo
	 */
	public Name getNameTwo() {

		return nameTwo;
	}

	/**
	 * @param nameTwo
	 *            the nameTwo to set
	 */
	public void setNameTwo(Name nameTwo) {

		this.nameTwo = nameTwo;
	}

	/**
	 * @return the addressOne
	 */
	public Address getAddress() {

		return address;
	}

	/**
	 * @param addressOne
	 *            the addressOne to set
	 */
	public void setAddress(Address address) {

		this.address = address;
	}

	/**
	 * @return the accountNumber
	 */
	public int getAccountNumber() {

		return this.accountNumber;
	}

	@Override
	public void createAccountNumber() {

		this.accountNumber = Account.startingNumber++;
	}

	@Override
	public void deposit(double amount) {

		balance += amount;
	}

	@Override
	public double withdraw(double amount) {

		if (balance <= 0) {

			return 0;
		} else if (amount > balance) {
			return 0;
		} else {

			balance -= amount;
			return amount;
		}
	}

	/**
	 * @return the dateOpened
	 */
	public Date getDateOpened() {

		return dateOpened;
	}

	/**
	 * @param dateOpened
	 *            the dateOpened to set
	 */
	public void setDateOpened(Date dateOpened) {

		this.dateOpened = dateOpened;
	}

	public boolean equal(Joint account) {

		return account.nameOne.equal(nameOne) && account.nameTwo.equal(nameTwo) && account.address.equals(address) && account.dateOpened.equal(dateOpened);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		return "Joint [nameOne=" + nameOne + ", nameTwo=" + nameTwo + ", addressOne=" + address + ", accountNumber=" + accountNumber + ", balance=" + balance + ", dateOpened=" + dateOpened + "]";
	}

}
