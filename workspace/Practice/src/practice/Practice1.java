package practice;

public class Practice1 {

	public static void main(String[] args) {
		math1 abc = new math1();
		// abc.QR(3);
		// math ab = new math();
		// ab.QR(8);
		// math.Method3(4, 2.5);

	}

}

class math {
	int b = 0;

	math(int c) {
		System.out.println("This is the cons.1 of parent class");
	}

	math(int c, double cb) {
		this(2.3);
		System.out.println("This is the cons.2 of parent class");

	}

	math(double cc) {
		this(1);
		System.out.println("This is the cons.3 of parent class");
		System.out.println("thge value of the cc " + this.b);
	}

	void QR(int a) {
		int d = 0;
		int c = 0;
		while (a != 0) {
			int b = a % 10;
			// c = c * 10 + b;
			a = a / 10;
			d++;
			System.out.println("______");
		}
	}

	static void Method3(int num) {
		if ((num % 2) == 0) {
			System.out.println("the number is even");
		} else {
			System.out.println("The number is odd");
		}
	}

	static void Method3(int num, double a) {
		math.Method3(5);
		System.out.println("The value of a is " + a);

		// if ((num%2)==0) {
		// System.out.println("the number is even");
		// }

	}
}

class math1 extends math {
	math1() {
		this(1, 1.1);
		QR(7);
		// QR(3);
		System.out.println("This is the cons.1 of child class");
	}

	math1(int c) {
		this();
		System.out.println("This is the cons.2 of child class");
	}

	math1(int c, double cb) {
		super(1, 1.1);
		System.out.println("This is the cons.3 of child class");

	}

	int d = 0;

	void QR(int a) {
		QR(3, 4);
		// int b = b;
		// int c = 0;
		while (a != 0) {
			int b = a % 10;
			// c=c*10+b;
			a = a / 10;
			++d;
			System.out.println("The remainder is " + b);
			System.out.println(" Non static method");

		}
	}

	void QR(int a, int z) {
		// int b = b;
		int ccc = 0;
		while (a != 0) {
			int b = a % z;
			// c=c*10+b;
			a = a / z;
			// ccc++;
			System.out.println("The quotient is ....." + ccc);
			ccc++;
			System.out.println(" Non static method");
		}
	}
}
