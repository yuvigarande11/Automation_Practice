package assignment;

public class PositiveNegative {

	public static void main(String[] args) {

		PositiveNegative.number(-13);
		PositiveNegative.number(13);
		PositiveNegative.number(0);
	}

	static int number(int num) {
		if (num >= 0) {
			System.out.println("The " + num + " is positive");
		} else {
			System.out.println("The number " + num + " is negative");
		}
		return num;
	}
}
