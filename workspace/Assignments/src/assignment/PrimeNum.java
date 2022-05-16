package assignment;

public class PrimeNum {

	public static void main(String[] args) {
		int a = 20;
		int i = 1;
		int b = 0;
		if ((a != 0) && (a != 1)) {
			for (; i <= a; i++) {
				if ((a % i == 0)) {
					b = b + 1;
					System.out.println("The number is divisible by : " + i);
				} else {
				}
				// System.out.println("The number is divisible by : "+b);
			}
			if (b > 2) {
				System.out.println("The number " + a + " is not a prime number");
			} else
				System.out.println("The number " + a + " is not a prime number");

		} else
			System.out.println("The number " + a + " is not a prime number");
	}
}
