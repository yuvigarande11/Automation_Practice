package assignment;

public class pyramid3 {

	public static void main(String[] args) {
		for (int rows = 0; rows <= 10; rows++) {
			System.out.print("             ");
			for (int coloumns = 0; coloumns <= rows; coloumns++) {
				System.out.print("*");

			}
			System.out.println(" ");
		}

		for (int rowss = 0; rowss <= 10; rowss++) {
			System.out.print("             ");
			for (int coloumn = 10; coloumn >= rowss; coloumn--) {
				System.out.print("*");

			}
			System.out.println(" ");

		}
	}
}

/*
 * { for(int rows=1;rows<=10;rows++) {for(int coloumn=1;coloumn<=rows;coloumn++)
 * {System.out.print("*");
 * 
 * } System.out.println(" "); } }
 */
