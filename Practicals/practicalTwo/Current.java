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
	private double overdraftSet;
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

		overdraftSet = overdraft;
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
	 * As you can see we need to override the methods from the account class. We
	 * have made these abstract as both the current and joint accounts differ in
	 * that the current account has an overdraft. This must be dealt with when
	 * depositing and withdrawing money.
	 */
	@Override
	public void deposit(double amount) {

		// First get the remainder of the overdraft
		double fixOverdraft = overdraftSet - overdraft;

		System.out.printf("%f overdraft remaining \n", fixOverdraft);

		// Check if the balance is 0
		if (balance == 0) {

			// Check that the amount is greater than the remaining overdraft
			if (amount > fixOverdraft) {

				// Take the remaining overdraft away from the deposit
				amount -= fixOverdraft;

				System.out.printf("%f remaining amount \n", amount);

				// Set the overdraft back to original amount
				overdraft = overdraftSet;

				System.out.printf("%f overdraft \n", overdraft);

				// Set balance to the remaining deposit
				balance = amount;

				System.out.printf("%f balance \n", balance);

			} else {

				// Else if amount is less than the remaining overdraft fix the overdraft
				overdraft += amount;
			}

		} else if (balance > 0) {

			// If the balance greater than 0 just add the deposit
			balance += amount;
		}
	}

	@Override
	public double withdraw(double amount) {

		// Set a volatile variable
		double withdraw = amount;

		// Check if there is enough money either in the balance or overdraft
		if (balance <= 0 && overdraft <= 0) {

			return 0;
		} else if (balance <= 0 && amount > overdraft) {

			return 0;
		} else if (amount > (balance + overdraftSet)) {

			return 0;

		} else if (balance <= 0 && amount < overdraft) {

			// If balance is 0 but amount is less than overdraft continue
			overdraft -= withdraw;
			return amount;

		} else if (balance > 0) {

			// If balance contains money but amount is grater than balance
			// but less than overdraft, we withdraw from balance first and
			// take the remainder from the overdraft
			if (amount > balance) {

				withdraw -= balance;
				balance = 0;
				overdraft -= withdraw;
				return amount;

			}

			// Else if the amount is less than the balance
			balance -= withdraw;
			return amount;
		}

		return 0;
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
	 * @param overdraft
	 *            the overdraft to set
	 */
	public void setOverdraft(double overdraft) {

		this.overdraft = overdraft;
	}

	public boolean equal(Current account) {

		return account.name.equal(name) && account.address.equals(address) && account.dateOpened.equal(dateOpened);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		return "Current [name=" + name + ", address=" + address + ", accountNumber=" + accountNumber + ", dateOpened=" + dateOpened + ", balance=" + balance + ", overdraft=" + overdraft + "]";
	}

}
