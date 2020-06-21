package MakeCar;
import java.util.*;

public class makeCars {

	public static void main(String[] args) {
		
		System.out.println("Please order three cars."); 
		System.out.println("Enter a car make, model, year, color. ");
		Scanner getCar = new Scanner(System.in).useDelimiter("\\,");
		
		
		
		String theCar = getCar.nextLine();
		String delims = "[, ]+";
		String[] parts = theCar.split(delims);
		
		String mk = parts[0];
		String md = parts[1];
		int yr = Integer.parseInt(parts[2]);
		String clr = parts[3];
		
		Car oneCar = new Car(mk, md, yr, clr);
		
//		getCar.close();
		
		System.out.println(oneCar.toString());
		
       
	}

}
