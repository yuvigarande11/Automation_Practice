package assignment;

public class pyramid4 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 15; j >= i; j--) {
				System.out.print(" ");

			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");

			}
			for (int l = 1; l <= i; l++) {
				System.out.print("*");

			}
			System.out.println();

		}
	}
}
