package helloworld;

public class Car {	
	
	String model;
	String make;
	int year;
	String color;
	int speed;
	int mileage;
	private String VIN;
	static String emergencyNumber = "911";
	
	public Car(String model, String make, int year, String color) {
	
		super();
		this.model = model;
		this.make = make;
		this.year = year;
		this.color = color;
		this.speed = 0;
		this.mileage = 0;
		VIN = String.valueOf((int)(Math.random()*1000));
	}
	
	public Car(String model, String make, String color, int year) {
		
		this(model, make, year, color);
	}

	public static void main(String[] args) {
		

	}

	void speedUp(int speedChange) {
		speed += speedChange;
	}
	
	void speedDown(int speedChange) {
		speed -= speedChange;
	}
	
	void runFor(int hour) {
		mileage += speed * hour;
	}
}
