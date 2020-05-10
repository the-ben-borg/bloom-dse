package helloworld;

public class Car {	
	
	String make;
	String model;
	int year;
	String color;
	int speed;
	int mileage;
	private String VIN;
	static String emergencyNumber = "911";
	
	public Car(String make, String model, int year, String color) {
	
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
		this.speed = 0;
		this.mileage = 0;
		VIN = String.valueOf((int)(Math.random()*1000));
	}
	
	public Car(String make, String model, String color, int year) {
		
		this(make, model, year, color);
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
