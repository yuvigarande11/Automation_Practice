package assignment;

public class NoOfDigits2 {

	// int num=10000;
	public static void main(String[] args) {
		int a = 1234346807;
		int b = 0;
		System.out.print("The no. of digits in  = ");
		{
			while (a != 0) {
				b = b + 1;
				a = a / 10;

			}
			System.out.print(b);
		}
	}
}
