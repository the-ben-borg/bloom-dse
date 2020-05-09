package assignment2;

public class boole {

	public static void main(String[] args) {
		int n = 1;
		
		while (n <= 2) {
			boolean a = (n < 2);
			if (a == true) {
				for (int i = 1; i <= 50; i++) {
					System.out.println(i);
				}
			} else {
				for (int b = 51; b <= 100; b++) {
					System.out.println(b);
				}
			}
			n++;

		}
		
	}

}
