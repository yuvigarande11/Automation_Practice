package assignment;

public class FactorsNegativeNo {

	public static void main(String[] args) {
		int a = -100;
		int i = (-1) * a;
		System.out.print("****The factors of a number " + a + " =\n ");
		for (; a <= i; i--) {
			if (i != 0) {
				if (a % i == 0) {
					System.out.print(i+",");
				}
			} else {
				i = 0;
			}

		}
	}
}
