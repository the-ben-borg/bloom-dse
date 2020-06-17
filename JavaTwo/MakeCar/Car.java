package MakeCar;
import java.util.Scanner;


public class Car {	
	
	String make;
	String model;
	int year;
	private String color;
	int speed;
	int mileage;
	private String VIN;
	static String emergencyNumber = "911";
	public String publicStr = "public";
	protected String protectedStr = "protected";
	private String privateStr = "private";
	// public abstract void fuel();
	public static String[] VINs = new String[100];
	public static int currentIndex = 0; 
	
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
    
    public String toString() {
		return make + " " + model + " " + year + " " + color;
    }
    
    public String getColor() {
        Scanner col = new Scanner(System.in);
        System.out.println("What color car? ");
        String clr = col.nextLine();
        return clr;
        
    }

    public void changeColor(String color) {
        this.color = color;
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
