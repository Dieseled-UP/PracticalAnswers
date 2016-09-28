package practicalTwo;

public abstract class Account {

	/**
	 * We have to decide what all accounts have in common
	 * so even though every account these days must have an associated
	 * name and address these variables are still associated with the
	 * type of account.  One concrete variable that every account has is
	 * an ACCOUNT NUMBER
	 */
	protected static int startingNumber = 1;
	protected int accountNumber;
	protected double balance;
	
	public abstract void createAccountNumber();

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/**
	 * Even though this is very basic and not persistent,
	 * code can be written to ensure that the account number
	 * is different for every type of account 
	 */
}
