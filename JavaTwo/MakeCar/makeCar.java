package MakeCar;
import java.util.Scanner;

public class makeCar {
    
    public static void main (String[] args) {
        Scanner ord = new Scanner(System.in);

        System.out.println("What make of car? ");

        String inMake = ord.nextLine();

        System.out.println("What model of car? ");

        String inModel = ord.nextLine();

        System.out.println("Which year? ");

        String inYear = ord.nextLine();

        System.out.println("What color? ");

        String inColor = ord.nextLine();

        System.out.println("You ordered a: " + inColor + " " + inYear + " " + inMake + " " + inModel);

        Car newCar = new Car(inMake, inModel, Integer.parseInt(inYear), inColor);

        System.out.println("Here is your new vehicle: " + newCar.toString());
          
    }
}