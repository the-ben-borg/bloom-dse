package Assignment3;
import java.util.Scanner;

public class highLow {

	public static void main(String[] args) {
		int target = 75;
		int guess = highLow.getGuess();
		
			while (guess != target) {
				if (guess < target) {
					System.out.println("You guessed too low.");	
				} else if (guess > target) {
					System.out.println("You guessed too high.");
				} 
				guess = highLow.getGuess();
				if (guess == target) {
                    System.out.println("You guessed it! The number is " + target);
                    
				}	
			} 
	}
	
	public static int getGuess() {
		Scanner in = new Scanner(System.in);
		System.out.println("Take your best guess: ");
		String input = in.nextLine();
		
        int g = Integer.parseInt(input);
		return g;
	}
}