package practicalTwo;

import practicalOne.Address;
import practicalOne.Date;
import practicalOne.Name;

public class Joint {

	// We will use composition to access the address and date objects
		private Name nameOne;
		private Name nameTwo;
		private Address addressOne;
		private Address addressTwo;
		private static int accountNumber = 1;
		private double balance;
		private Date dateOpened;
		
		public Joint() {
			this(null, null, null, null, 0, null);
		}

		/**
		 * @param nameOne
		 * @param nameTwo
		 * @param addressOne
		 * @param addressTwo
		 * @param balance
		 * @param dateOpened
		 */
		public Joint(Name nameOne, Name nameTwo, Address addressOne, Address addressTwo, double balance,
				Date dateOpened) {
			this.nameOne = nameOne;
			this.nameTwo = nameTwo;
			this.addressOne = addressOne;
			this.addressTwo = addressTwo;
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
		 * @param nameOne the nameOne to set
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
		 * @param nameTwo the nameTwo to set
		 */
		public void setNameTwo(Name nameTwo) {
			this.nameTwo = nameTwo;
		}

		/**
		 * @return the addressOne
		 */
		public Address getAddressOne() {
			return addressOne;
		}

		/**
		 * @param addressOne the addressOne to set
		 */
		public void setAddressOne(Address addressOne) {
			this.addressOne = addressOne;
		}

		/**
		 * @return the addressTwo
		 */
		public Address getAddressTwo() {
			return addressTwo;
		}

		/**
		 * @param addressTwo the addressTwo to set
		 */
		public void setAddressTwo(Address addressTwo) {
			this.addressTwo = addressTwo;
		}

		/**
		 * @return the accountNumber
		 */
		public static int getAccountNumber() {
			return accountNumber;
		}

		/**
		 * @param accountNumber the accountNumber to set
		 */
		public static void setAccountNumber(int accountNumber) {
			Joint.accountNumber = accountNumber;
		}

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
		 * @return the dateOpened
		 */
		public Date getDateOpened() {
			return dateOpened;
		}

		/**
		 * @param dateOpened the dateOpened to set
		 */
		public void setDateOpened(Date dateOpened) {
			this.dateOpened = dateOpened;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Joint [nameOne=" + nameOne + ", nameTwo=" + nameTwo + ", addressOne=" + addressOne + ", addressTwo="
					+ addressTwo + ", balance=" + balance + ", dateOpened=" + dateOpened + "]";
		}
		
}
