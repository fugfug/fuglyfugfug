package qwert;

public class Car {
	//instance data variables
	private String make;
	private String model;
	private int year;
	public final int OLD_CAR_YEAR = 1900;
	public final int CURRENT_YEAR = 2016;
	
	//constructor
	public Car(String carMake, String carModel, int carYear){
		make = carMake;
		model = carModel;
		year = carYear;
	}
	
	//getters
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	
	//setters
	public void setMake(String newMake){
		make = newMake;
	}
	public void setModel(String newModel){
		model = newModel;
	}
	public void setYear(int newYear){
		year = newYear;
	}
	
	//toString method
	public String toString(String s){
		s = "Make: " + make + 
				"Model: " + model + 
				"Year: " + year;
		return s;
	}
	
	//additional method
	public void carYear(){
		if (year < OLD_CAR_YEAR) {
			System.out.print("this is an old car");
		} else if(year > CURRENT_YEAR) {
			System.out.print("this car is not out yet");
		}
	}

}
