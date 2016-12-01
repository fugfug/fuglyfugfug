
public class BankAccount {
	// instance data variables
	private String owner;
	private String id;
	private double balance;
	private double interest;
	public final double CONVERTINTEREST = .01;
	public final int MINIMUMDEPOSIT = 0;
	public final int MINIMUMWITHDRAWAL = 0;

	// constructor
	public BankAccount(String accountOwner, String accountID, 
			double accountBalance, double interestRate) {
		owner = accountOwner;
		id = accountID;
		balance = accountBalance;
		interest = interestRate;
	}

	// getters
	public String getOwner() {
		return owner;
	}

	public String getID() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public double getInterest() {
		return interest;
	}

	// setters
	public void setAccountOwner(String newOwner) {
		owner = newOwner;
	}

	public void setAccountID(String newID) {
		id = newID;
	}

	public void setAccountBalance(double newBalance) {
		balance = newBalance;
	}

	public void setInterest(double newInterest) {
		interest = newInterest;
	}

	// toString method
	@Override
	public String toString() {
		return "Account Owner: " + owner + 
				"\nAccount ID: " + id + 
				"\nAccount Balance: " + balance;
	}

	// deposit method
	public void Deposit(double deposit) {
		if(deposit < MINIMUMDEPOSIT) {
			System.out.println("Deposit amount must be zero or greater.");
		} 
		else {
			balance = balance + deposit;
		}	

	}

	// withdraw method
	public void Withdraw(double withdraw) {
		if(withdraw > balance) {
			System.out.println(" Insufficient funds.");
		}else if (withdraw < MINIMUMWITHDRAWAL) {
			System.out.println("withdraw amount must be zero or greater");
		} else {
			balance = balance - withdraw;
		}	
	}
	
	//add interest method
	public void Interest(double rate) {
		balance = (balance*(rate*CONVERTINTEREST)) + balance;
	}
}





