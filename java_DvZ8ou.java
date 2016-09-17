
public class BankAccount() 
{
  //instance data variables
  private String accountOwner;
  private String accountID;
  private double accountBalance;
  private int interest;
  public final double CONVERTINTEREST = .01;
  
  //constructor
  public BankAccount(String owner, String id, double balance, int rate) {
    accountOwner = owner;
    accountID = id;
    accountBalance = balance;
    interest = rate;
  }
  
  //getters
  public String getAccountOwner(){
    return accountOwner;
  }
  public String getAccountID(){
    return accountID;
  }
  public double getAccountBalance() {
    return accountBalance;
  }
  public int getInterest() {
    return interest;
  }
  
  //setters
  public void setAccountOwner(String name){
    accountOwner = name;
  }
  public void setAccountID(String userID) {
    accountID = userID;
  }
  public void setAccountBalance(double initialBalance){
    accountBalance = initialBalance;
  }
  public void setInterest(int interestRate) {
    interest = interestRate;
  }
  
  //toString method
  public String toString(){
    return "Account Owner: " + accountOwner + 
           "Account ID: " + accountID +
           "Account Balance: " + accountBalance + 
           "Interest Rate: " + interest;
  }
  
  //deposit method
  public void Deposit() {
    
  }
  
  //withdraw method
}