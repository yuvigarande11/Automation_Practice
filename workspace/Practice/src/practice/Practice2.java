package practice;

public class Practice2 {

	public static void main(String[] args) {

		//child2 a = new child2();
		//a.method1();
		child2 b = new child2();
		b.method1();
		//parent c=new parent();
		//c.method1();
	}
}

class parent {
	void method1() {
		System.out.println("The parent class");
		//char c='A';
		for (int i = 1; i <= 5; i++) { char c='A';
			for (int j = 1; j <= i; j++) {
				System.out.print(c+" ");
				c++;
			}
			System.out.println(" ");//c++;
		}

		
	}
}

class child1 extends parent {
	void method1() {
		 super.method1();
		// System.out.println("observing overriding between child1 and parent");

		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}

class child2 extends child1 {
	void method1() {
		 super.method1();
		// System.out.println("observing overriding between child2 and child 1");

		for (int k = 1; k <= 5; k++) {
			for (char l = 1; l <= k; l++) {
				System.out.print(+l);
			}
			System.out.println(" ");
		}
	}
}