package interview;

public class Lengthofstring {
	static void factorial(int a) {
		int factorial1 = 1;
		for (int j = 1; j <= a; j++) {
			factorial1 = factorial1 * j;
		}
		System.out.println("The factors of the " + a + " is :" + factorial1);
	}

	int Reverseno(int b) {
		int reverse = 0;
		int c = b;
		System.out.println(b);
		System.out.print("The reverse number is :");
		if (b % 10 == 0) {
			System.out.print("0");
		}
		while (c != 0) {
			int mod = c % 10;
			reverse = reverse * 10 + mod;
			c = c / 10;

		}
		System.out.println(reverse);
		return reverse;
	}

	public static int sumdivisibleby7(int abc, int pqr) {
		int sum = 0;
		int i2 = abc;

		while (i2 != pqr) {

			if ((i2 % 7) == 0) {
				sum = sum + i2;
				i2++;
			}
			i2++;
		}
		System.out.println("The sum of  nubers divisible by 7 in between " + abc + " - " + pqr + " :  " + sum);
		return sum;
	}

	// ******************************************************
	static void multipicationtable(int mul1, int mul2) {
		System.out.println("The multiplication table  between " + mul1 + " & " + mul2 + " is ");
		int table = 1;
		for (int i3 = mul1; mul1 <= mul2; mul1++) {
			System.out.println();
			for (int i4 = 1; i4 <= 10; i4++) {
				table = mul1 * i4;
				System.out.print(table);
				System.out.print(" ");
			}
		}

	}

	// ****************************************************************
	// Write a program to Swap the values.
	int swap(int abc1, int pqr1) {
		System.out.println("The numbers before swaping " + abc1 + " & " + pqr1);
		int c = abc1;
		abc1 = pqr1;
		pqr1 = c;
		System.out.println("The numbers after swaping " + abc1 + " & " + pqr1);
		return c;
	}

	// ****************************************************************
	static public int monthstodays(int days) {
		int month = days / 30;
		int day = days % 30;
		System.out.println("The " + month + "months" + day + " & days ");
		return month;
	}

	// ****************************************************************
	static void triangle1(int tri1) {
		for (int i = tri1; i > 0; i--) {
			System.out.println();
			for (int j = i; j <= tri1; j++) {
				System.out.print(i + " ");

			}
		}
	}
	// ****************************************************************
		static void triangle2(int tri2) {
			for (int i = 1; i <=tri2; i++) {
				System.out.println();
				for (int j = i; j <= tri2; j++) {
					System.out.print(i + " ");

				}
			}
		}
		// ****************************************************************
      void armstrong(int arm) {
    	  int arm1=arm;
    	  int reverse1=0;
    	  while(arm1!=0) {
    	  int mod=arm%10;
    	   reverse1=reverse1*10+mod;
    	   arm1=arm1/10;
    	   //System.out.println(reverse1);
    	   System.out.println(arm1);
    	  }
    	  System.out.println(reverse1);
    	  if(arm==reverse1) {
    		  System.out.println("the "+arm+"is armstrong number");
    	  }
    	  System.out.println("the "+arm+"is armstrong not number");
      }
		
	public static void main(String[] args) {
		// 1. count of characters
		String ab = "hey1234876hey";
		System.out.println("The length of String is-:" + ab.length());
		System.out.println("******************************************************");
		// 2.String change from james to james is name
		String a = "James";
		String a1 = " is name";
		System.out.println(a.concat(a1));
		System.out.println(a + a1);
		System.out.println("******************************************************");
		// 3.Reverse string
		String a2 = "Acceleration";
		String rev = "";
		for (int i = a2.length() - 1; i >= 0; i--) {
			rev = rev + a2.charAt(i);
		}
		System.out.println("the reverse string is :" + rev);
		System.out.println("******************************************************");
		// 6.factorial of given number

		Lengthofstring.factorial(10);

		System.out.println("******************************************************");
		// 7.Reverse a given no.
		Lengthofstring ab1 = new Lengthofstring();
		ab1.Reverseno(674590);
		System.out.println("******************************************************");
		// 8.sum number between 100 to200 divisible by 7
		Lengthofstring.sumdivisibleby7(100, 200);
		System.out.println("******************************************************");
		// 9. multiplication table
		multipicationtable(1, 10);
		System.out.println("\n");

		System.out.println("******************************************************");
		// 10.Write a program to Swap the values.
		Lengthofstring ab2 = new Lengthofstring();
		ab2.swap(121, 456);
		System.out.println("******************************************************");
		//11. Write a program to convert given no. of days into months and days
		monthstodays(69);
		
		System.out.println("******************************************************");
		//12. Triangle1
		triangle1(5);
		System.out.println();
		System.out.println("******************************************************");
		//13. triangle2
		triangle2(5);
		System.out.println();
		System.out.println("******************************************************");
		Lengthofstring ab3 = new Lengthofstring();
		ab3.armstrong(121);
		
	}

}
