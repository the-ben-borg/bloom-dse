package assignment3;

public class Accord {

	String make;
	String model;
	int year;
	String color;
	int speed;
	int mileage;
	private String VIN;
	static String emergencyNumber = "911";
	
	public Accord(String make, String model, int year, String color) {
		
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
		this.speed = 0;
		this.mileage = 0;
		VIN = String.valueOf((int)(Math.random()*1000));
	}
	
	public static void main(String[] args) {
		

	}

}
