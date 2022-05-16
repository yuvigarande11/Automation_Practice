package assignment;

public class PalindromicNo {
//static int reverse;
	public static void main(String[] args) {
		int a = 55555;
		int c = a;
		int reverse = 0;
		for (; c != 0;) {
			int rem = c % 10;
			reverse = reverse * 10 + rem;

		}
		if (reverse == a) {
			System.out.println("The number " + a + " is palindrom.");
		} else
			System.out.println("The number " + a + " is not a palindrom.");
	}

}
