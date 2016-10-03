package practicalTwo;

import practicalOne.Address;
import practicalOne.Date;
import practicalOne.Name;

public class Current extends Account {

	// We will use composition to access the address and date objects
	private Name name;
	private Address address;
	private int accountNumber;
	private Date dateOpened;
	private double overdraft;

	public Current() {
		this(null, null, 0, 0, null);
		createAccountNumber();
	}

	/**
	 * @param name
	 * @param address
	 * @param accountNumber
	 * @param balance
	 * @param dateOpened
	 */
	public Current(Name name, Address address, double balance, double overdraft, Date dateOpened) {
		this.name = name;
		this.address = address;
		this.balance = balance;
		this.overdraft = overdraft;
		this.dateOpened = dateOpened;
		createAccountNumber();
	}

	/**
	 * @return the name
	 */
	public Name getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(Name name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public void createAccountNumber() {

		this.accountNumber = Account.startingNumber++;
	}

	/**
	 * @return the accountNumber
	 */
	public int getAccountNumber() {
		return this.accountNumber;
	}

	/**
	 * @return the dateOpened
	 */
	public Date getDateOpened() {
		return dateOpened;
	}
	
	/**
	 * @return the overdraft
	 */
	public double getOverdraft() {
		return overdraft;
	}

	/**
	 * @param overdraft the overdraft to set
	 */
	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

	public boolean equal(Current account) {
		return account.name.equal(name) && account.address.equals(address) && account.dateOpened.equal(dateOpened);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Current [name=" + name + ", address=" + address + ", accountNumber=" + accountNumber + ", dateOpened="
				+ dateOpened + ", balance=" + balance + ", overdraft=" + overdraft + "]";
	}
	
}
