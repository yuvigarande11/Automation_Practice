package assignment;

public class pyramid5 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");

			}
			for (int k = 10; k >= i; k--) {
				System.out.print("*");

			}
			for (int l = 10; l >= i + 1; l--) {
				System.out.print("*");

			}
			System.out.println();

		}
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");

			}
			for (int k = 10; k >= i; k--) {
				System.out.print(" *");

			}

			System.out.println();

		}
	}
}
