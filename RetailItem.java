package qwert;

public class RetailItem {
	//instance data variables
	private String description;
	private int amount;
	private double price;
	public final int RESTOCK = 0;
	
	//constructor
	public RetailItem(String itemDescription, int itemAmount, double itemPrice){
		description = itemDescription;
		amount = itemAmount;
		price = itemPrice;
	}
	
	//getters
	public String getDescription(){
		return description;
	}
	public int getAmount(){
		return amount;
	}
	public double getPrice(){
		return price;
	}
	
	//setters
	public void setDescription(String newDescription){
		description = newDescription;
	}
	public void setAmount(int newAmount){
		amount = newAmount;
	}
	public void setPrice(double newPrice){
		price = newPrice;
	}
	
	//toString method
	public String toString(){
		return "Description: " + description + 
				"Amount: " + amount +
				"Price: " + price;
	}
	
	//additional method
	public void checkAmount(){
		if(amount == RESTOCK) {
			System.out.print("restock");
		}
		else if(amount < RESTOCK){
			System.out.print("invalid there cant be negatives you sillybilly");
		}
	}
}








