package MakeCar;
import java.util.Scanner;

public class makeCars {

	// Method to take input and return a new Car
	public static Car genCar (Scanner getCar) {  // Call method, initiate Scanner
		String theCar = getCar.nextLine();
		String delims = "[, ]+";  // Set appropriate delimiters in variable
		String[] parts = theCar.split(delims);  // Split String input and parse by delimiters into array
		String mk = parts[0];  // Next four lines take each array element and create the appropriate variable
		String md = parts[1];
		int yr = Integer.parseInt(parts[2]);
		String clr = parts[3];
		Car thisCar = new Car(mk, md, yr, clr);  // Feed the parts into Car constructor to create new Car object
		return thisCar;
	}

	// Method to find oldest car in the array
	public static Car oldest(Car[] carArray) {
		int minYear = 2021;  // Set to current year plus one to exclude all invalid cases
		int idxOfOldest = -1;
		for (int i = 0; i < carArray.length; i++) {  // Loop through each array element to determine oldest car by means of linear search
			if (carArray[i].year < minYear) {
				idxOfOldest = i;
			}
		}
		return carArray[idxOfOldest];
	}

	public static void main(String[] args) {
		
		System.out.println("Please order three cars.");
		Car[] carArray;	// Initialize array
		carArray = new Car[3];  // Make three slots in the array

		for (int i = 0; i < 3; i++) {
			System.out.println("Enter a car make, model, year, color. ");	// Loop to gather input and create a Car for each iteration, now hard-coded at 3
			Scanner getCar = new Scanner(System.in).useDelimiter("\\,");
			carArray[i] = genCar(getCar);
		}

		String oldCar = oldest(carArray).toString();	// Use the method to find the oldest Car, convert to String, store in variable
		System.out.println("The oldest car you ordered is the: " + oldCar);  // Print the oldest Car to console

	}

}
