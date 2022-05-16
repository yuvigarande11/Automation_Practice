package assignment;

public class pyramid {

	public static void main(String[] args) {

		{
			for (int rows = 1; rows <= 10; rows++) {
				for (int spaces = 10; spaces >= rows; spaces--) {
					System.out.print(" ");

				}
				// System.out.println(" ");

				// System.out.println(" -------------------");
				for (int x = 1; x <= rows; x++) {
					System.out.print("*");
				}
				System.out.println(" ");
			}
		}

		for (int a = 1; a <= 10; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print(" ");
			}
			for (int c = 10; c >= a; c--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
