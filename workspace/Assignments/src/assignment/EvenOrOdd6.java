package assignment;

public class EvenOrOdd6 {
	static int number = 30;

	public static void main(String[] args) {
		EvenOrOdd6.eo(19.0);

		System.out.println("The value of global variable is= " + number);
		if ((number % 2) == 0) {
			System.out.println("The number " + number + " is even");

		} else
			System.out.println("The number" + number + " is odd");
	}

	static double eo(double num) {
		if ((num % 2) == 0) {
			System.out.println("The number " + num + " is even");

		} else {
			System.out.println("The number " + num + " is odd");
		}
		return num;
	}

}
