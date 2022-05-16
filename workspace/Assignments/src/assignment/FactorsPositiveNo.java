package assignment;

public class FactorsPositiveNo {

	public static void main(String[] args) {
		int i = 1;
		int a = 100;
		System.out.print("****The factors of a number " + a + " = ");
		for (; a >= i; i++) {
			if (a % i == 0) {
				System.out.print(i + " , ");
			}
		}
	}
}
