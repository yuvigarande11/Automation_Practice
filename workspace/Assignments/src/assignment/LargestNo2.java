package assignment;

public class LargestNo2 {

	public static void main(String[] args) {
		int A = 100000, B = 1000, C = 30000;
		{
			if (A > B) {
				if (A > C)
					System.out.println("The Largest number is A=" + A);
				else
					System.out.println("The Largest number is C=" + C);
			} else if (C > B) {
				System.out.println("The Largest number is C=" + C);
			} else
				System.out.println("The Largest number is B=" + B);
		}
		//2nd method
		if ((A > B) || (A > C)) {
			System.out.println("The Largest number is A=" + A);
		} else if ((B > A) || (B > C)) {
			System.out.println("The Largest number is B=" + B);
		} else

			System.out.println("The Largest number is C=" + C);
	}

}
