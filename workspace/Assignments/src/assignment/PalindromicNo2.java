package assignment;

public class PalindromicNo2 {
//static int reverse;
	public static void main(String[] args) {
		int a = 121;
		int c = a;
		int reverse = 0;
		while (c != 0) {
			int rem = a % 10;
			reverse = reverse * 10 + rem;
			c = c / 10;
		}
		if (reverse == a) {
			System.out.println("The number " + a + " is palindrom.");
		} else
			System.out.println("The number " + a + " is not a palindrom.");
	}

}
