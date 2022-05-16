package assignment;

public class SmallestNo {

	public static void main(String[] args) {
		int A = 3000000, B = 2000000, C = 100000;
		if (A < B) {
			if (A < C)
				System.out.println("The smalest number is A=" + A);
			else
				System.out.println("The smalest number is C=" + C);
		} else if (C < B) {
			System.out.println("The smalest number is C=" + C);
		} else
			System.out.println("The smalest number is B=" + B);
	}

}
