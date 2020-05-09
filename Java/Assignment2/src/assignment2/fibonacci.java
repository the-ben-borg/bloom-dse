package assignment2;

public class fibonacci {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int sum = 1;
		System.out.println(b);
		
		while (sum < 144)
		{
			int f = a + b;
			a = b;
			b = f;
			System.out.println(f);
			sum += f;
		}
		 //System.out.println();
	}

}
