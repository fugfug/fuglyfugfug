
public class BankAccount {
	// instance data variables
	private String accountOwner;
	private String accountID;
	private double accountBalance;
	private int interest;
	public final double CONVERTINTEREST = .01;
	public final int MINIMUMDEPOSIT = 0;
	public final int MINIMUMWITHDRAWAL = 0;

	// constructor
	public BankAccount(String owner, String id, double balance, int rate) {
		accountOwner = owner;
		accountID = id;
		accountBalance = balance;
		interest = rate;
	}

	// getters
	public String getAccountOwner() {
		return accountOwner;
	}

	public String getAccountID() {
		return accountID;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public int getInterest() {
		return interest;
	}

	// setters
	public void setAccountOwner(String newOwner) {
		accountOwner = newOwner;
	}

	public void setAccountID(String newID) {
		accountID = newID;
	}

	public void setAccountBalance(double newBalance) {
		accountBalance = newBalance;
	}

	public void setInterest(int interestRate) {
		interest = interestRate;
	}

	// toString method
	public String toString() {
		String s = "Account Owner: " + accountOwner.toString() + "\nAccount ID: " + accountID.toString() + 
				"\nAccount Balance: " + accountBalance;
		return s;
	}

	// deposit method
	public void Deposit(double deposit) {
		if(deposit < MINIMUMDEPOSIT) {
			System.out.print("Deposit amount must be zero or greater.");
		} 
		else {
			//System.out.print(accountBalance + deposit);
			accountBalance = accountBalance + deposit;
		}	

	}

	// withdraw method
	public void Withdraw(double withdraw) {
		if(withdraw > accountBalance) {
			System.out.print(" Insufficient funds.");
		}else if (withdraw < MINIMUMWITHDRAWAL) {
			System.out.print("withdraw amount must be zero or greater");
		} else {
			accountBalance = accountBalance - withdraw;
		}	
	}
	
	public void Interest(int rate) {
		double addedInterest = (accountBalance*(rate*CONVERTINTEREST)) + accountBalance;
	}
}





