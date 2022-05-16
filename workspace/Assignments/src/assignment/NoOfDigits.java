package assignment;

public class NoOfDigits {

	// int num=10000;
	public static void main(String[] args) {
		System.out.println("with the help of Do While loop\n");
		int number = 100000;
		int count = 0;

		do {
			number = number / 10;
			count++;
			// System.out.println(count);

		} while (number > 0);
		System.out.println("The no.of digits =" + count);

		{
			System.out.println("\n with the help of For loop\n ");
			int num = 190090;
			int a = 0;
			for (; num != 0; a++) {
				// num=num%10;
				num = num / 10;

				// System.out.println("The digits="+num);
			}
			System.out.println("The no. of digits=" + a);
		}
		System.out.println("\nwith the help of While loop\n");
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
