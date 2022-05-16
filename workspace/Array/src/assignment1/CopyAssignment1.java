package assignment1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CopyAssignment1 {
	public  void method1() {

		int A[];
		// int[] A;
		// int []A;
		A = new int[6];
		A[0] = 1;
		A[1] = 34;
		A[2] = 23;
		A[3] = 22;
		A[5] = 55;
		System.out.println("****************************************************");
		System.out.print("The array is :");
		for (int b : A) {
			System.out.print(b + " ,");
		}
		// clone of array
		System.out.println();
		System.out.println("****************************************************");
		System.out.println();
		int AA[] = A.clone();
		System.out.print("The clone /copy array is :");
		for (int b : AA) {
			System.out.print(b + " ,");
		}
		System.out.println();
		System.out.println("****************************************************");
		// copy of array upto 3rd index
		int AB[] = Arrays.copyOf(A, A.length);
		System.out.println();
		System.out.println("****************************************************");
		System.out.print("The clone /copy array is :");
		for (int b : AA) {
			System.out.print(b + " ,");
		}
		System.out.println();
		System.out.println("****************************************************");
		// cpmparison of array
		System.out.println();
		System.out.println(Arrays.equals(AB, AA));

	}

	public static int method2() {
		int B[] = { 1, 2, 5, 8, 3 };
		System.out.println("****************************************************");
		System.out.println("Array before sorting");
		for (int b : B) {
			System.out.print(b + " ,");
		}
		System.out.println();
		System.out.println("****************************************************");
		// Sorting Array
		Arrays.sort(B);
		System.out.println();
		System.out.println("Array after sorting");
		for (int b1 : B) {
			System.out.print(b1 + " ,");

		}
		return 1;
	}

	public static void main(String[] args) {
		CopyAssignment1 ref=new CopyAssignment1();
				ref.method1();
		System.out.println("####################################################");
		CopyAssignment1.method2();
		// System.out.println("The length of array B is :"+B.length);
	}

}
