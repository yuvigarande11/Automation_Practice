package assignment20;

import java.util.Arrays;


class SmallestNo {
	
	public static double method201() {
		System.out.println("**************Using for loop***********************\n");
		int A21[] = { 1, 3, 3, 5, 8, 9, 2, 3 };
		
		int b = A21[0];
		for (int a : A21) {
			if (a <= b) {
				b = a;
			}

		}
		System.out.println("The smallest value is " + b);
		System.out.println("****************smallest Using sort **************************\n");
		// anotherway of finding smallest number
		Arrays.sort(A21);
		System.out.println("The smallest value using sort technique :" + A21[0]);
		System.out.println("The largest  value using sort technique :" + A21[A21.length - 1]);
		return 2.0d;
	}

}

class LargestN0 {
	public double method201() {
		System.out.println("************** largest Using for loop***********************\n");
		int A21[] = { 1, 3, 3, 5, 8, 9, 2, 3 };
	
		int b = A21[0];
		for (int a : A21) {
			if (a >= b) {
				b = a;
			}

		}
		System.out.println("The largest value is " + b);
		System.out.println("****************largest Using sort **************************\n");
		// anotherway of finding smallest number
		Arrays.sort(A21);
		System.out.println("The smallest value using sort technique :" + A21[0]);
		System.out.println("The largest value using sort technique :" + A21[A21.length - 1]);
		return 2.0d;
	}

}

public class SmallestAssignment20 {

	public static void main(String[] args) {

		SmallestNo abc = new SmallestNo();
		abc.method201();

		LargestN0 ab = new LargestN0();
		ab.method201();
	}

}
