package assignment;

public class SwapNo5 {

	public static void main(String[] args) {
		int x = 30;
		int y = 40;
		System.out.println("Before swapping the number X=" + x + "\nBefore swapping the number y=" + y);

		int z = x;// temporary variable
		x = y;
		y = z;
		System.out.println("After swapping the number X=" + x + "\nAfter swapping the number y=" + y);
	}

}
