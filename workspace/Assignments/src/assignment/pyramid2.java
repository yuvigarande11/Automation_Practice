package assignment;

public class pyramid2 {

	public static void main(String[] args) {

		{
			for (int rows = 1; rows <= 10; rows++) {
				for (int coloumn = 1; coloumn <= rows; coloumn++) {
					System.out.print("*");

				}
				System.out.println(" ");
			}
		}
		System.out.println(" -------------------");
		for (int x = 1; x <= 10; x++) {
			for (int y = 10; y >= x; y--) {
				System.out.print("*");

			}
			System.out.println(" ");

		}

	}
}
