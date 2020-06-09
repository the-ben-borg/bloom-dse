package helloworld; // The file belongs to a package called "helloworld".

public class HelloWorld {	// The class HelloWorld starts here...

	public static void main(String[] args) {	// Defines a method in the class
		Car aCar = new Sedan("Honda", "Accord", 1998, "white");
		
		System.out.println("My car's year is: " + aCar.year);
		System.out.println("Contact this number in case of emergency: "+ Car.emergencyNumber);
		printSth(5);
		printSth(3.3, 7.7);
		printSth("Good");

	}
	
	public static void printSth(int i) {
		System.out.println(i);
	}
	
	public static void printSth(double d1, double d2) {
		System.out.println(d1 + " " + d2);
	}
	
	public static void printSth(String str) {
		System.out.println(str);
	}

}
