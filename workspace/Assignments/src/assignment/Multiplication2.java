package assignment;

public class Multiplication2 {

	public static void main(String[] args) {
		int num1 = 30, num2 = 40;
		System.out.println("The Multiplication of the two Numbers=" + (num1 * num2));
		System.out.println("The Multiplication of the two Numbers=" + Multiplication2.mult(5f, 6f));
		Multiplication2.mult(14.2, 13.5);

	}

	static float mult(float x, float y) {
		float multi = x * y;
		return multi;

	}

	static void mult(double z, double a) {
		double multi = z * a;
		System.out.println("The Multiplication of the two Numbers=" + multi);
	}

}
