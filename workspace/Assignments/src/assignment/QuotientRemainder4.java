package assignment;

public class QuotientRemainder4 {

	public static void main(String[] args) {
		QuotientRemainder4.quo_rem(13.0, 4.0);

	}

	static double quo_rem(double num1, double num2) {
		double rem = num1 % num2;
		double quo = num1 / num2;
		System.out.println("The quotient is\t\t:" + quo);
		System.out.println("The remainder is\t:" + rem);
		return rem;

	}
}
