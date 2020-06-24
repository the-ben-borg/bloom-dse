package MakeCar;
import java.util.*;


public abstract class Car {
	
	String make;
	String model;
	int year;
	private String color;
	private int speed;
	private int mileage;
	private String VIN;
	static String emergencyNumber = "911";
	public String publicStr = "public";
	protected String protectedStr = "protected";
	private String privateStr = "private";
	public abstract void fuel();

	public Car(String make, String model, int year, String color) {
	
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
		this.speed = 0;
		this.mileage = 0;

	}
	
	public Car(String make, String model, String color, int year) {
		
		this(make, model, year, color);
    }

    public Car(){
		super();
	}
    
    public String toString() {
		return make + " " + model + " " + year + " " + color;
    }
    
    public String getColor() {
        return color;
        
    }

    public String getVIN(){
		return VIN;
	}

	public static List VINs = new List();

    public void changeColor(String color) {
        this.color = color;
    }
    
    public int getSpeed() {
    	return speed;
    }
    
    public int getMileage() {
    	return mileage;
    }

	public static void main(String[] args) {
		Car civic = new Sedan ("Honda", "Civic", 1996, "Blue");

		civic.speedUp();
		civic.runFor(1);
		civic.speedUp();
		civic.runFor(1);
		civic.speedDown();
		civic.speedDown();

		System.out.println("mileage: " + civic.mileage + " speed: " + civic.speed);

	}

	void speedUp(int speedChange) {
		speed += speedChange;
		
		if(speed >= 140) {
			speed = 140;
		}
	}

	void speedUp() {
		speed += 10;
	}
	
	void speedDown(int speedChange) {
		speed -= speedChange;
	}

	void speedDown() { speed -= 10; }
	
	void runFor(int hour) {
		mileage += speed * hour;
	}

}
