package assignment;

public class ReverseNumber {

	public static void main(String[] args) {
		{
			int a = 17090;
			int rever = 0;
			for (; a != 0;) {
				int remem = a % 10;
				rever = rever * 10 + remem;
				a = a / 10;
			}
			System.out.println("the reverse number =" + rever);
		}
		int num = 10;
		int rev = 0;

		while (num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;

		}

		System.out.println("the reverse number =" + rev);
	}

}
