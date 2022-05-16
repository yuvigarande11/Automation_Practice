package assignment;

class Parent {
	int num;
	int revNo = 0;
	int year;

	public void Revnumber(int num) {
		this.num = num;
		int i = 1;
		int revNo = 0;
		while ((num != 0)) {
			int mod = num % 10;
			revNo = revNo * 10 + mod;
			num = num / 10;
			i++;
			this.revNo = revNo;
		}
	}

	void palindrome(int num) {
		if (this.revNo == this.num) {
			System.out.println("The number " + num + " is palindrom number");
		} else {
			System.out.println("The number " + num + " is not palindrom number");
		}
	}

	void leapyear(int year) {
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			System.out.println("Specified is "+year+" a leap year");
		else
			System.out.println("Specified year "+year+" is not a leap year");
	}
}

class child extends Parent {
	public void Revnumber(int num) {
		super.Revnumber(num);
		System.out.println("The reverse number is " + super.revNo);
	}

	void palindrom(int num) {
		super.num = num;
		super.Revnumber(num);
		super.palindrome(num);
	}

	void leapyear(int year) {
		this.year = year;
		super.leapyear(year);

	}

	public void commonmethod() {

		this.Revnumber(12345678);
		System.out.println("*************************************");
		this.palindrome(19);
		System.out.println("*************************************");

		this.leapyear(2000);
	}
}

public class Overriding {

	public static void main(String[] args) {

		child obj = new child();
		obj.commonmethod();
		// obj.Revnumber(11);
		// obj.palindrome(1);
		// obj.leapyear(2112);

	}
}
