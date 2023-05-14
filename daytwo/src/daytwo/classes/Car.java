package daytwo.classes;

public class Car {
	
	//brand -- name of company who is manufacturing the car for example honda,toyota etc
	//models -- City,Innova etc .  
	//transmission ---  Automatic or Manual
	//fuelType --- Diesel, Petrol,Hybrid, EV
	//String type data --- which is a group of characters i.e. "Hello"
	//char c = 'h'; char[] arrC = ['H','e','l','l','o']
	
	/**
	 * Below are the properties of class Car
	 */
	String brand;
	String models;
	String transmission;
	String fuelType;
	int yearOfMfg;
	double price;
	
	//Constructor of a class also No argument constructor or default constructor 
	/*
	 * Car() {
	 * 
	 * }
	 */
	/**
	 * 
	 */
	/**public Car() {
		
	}*/

	
	//accessor methods-- getter and setter methods . These are methods to access properties of a class or object

	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModels() {
		return models;
	}

	public void setModels(String models) {
		this.models = models;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getYearOfMfg() {
		return yearOfMfg;
	}

	public void setYearOfMfg(int yearOfMfg) {
		this.yearOfMfg = yearOfMfg;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

}
