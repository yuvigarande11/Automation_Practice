package assignment2;
import assignment1.*;
public class FreqAssignment2 {
	public static double method21() {int count1=0;int ac=0;
		int A21[] = { 1, 3, 3, 5, 3, 3, 2, 3 };
		for (int a : A21) {
			int count=0;
			//int count = 0;int count1=0;int ac=0;
			for (int c : A21) {
				
				if (a == c) {
					count++;
					if (count>count1) {
						count1=count;
						 ac=a;
					}
				}
			}
			System.out.println("The frequency of number :" + a + " is " + count);
			//System.out.println("The maximum frequency of number :" + ac + " is " +count1);
		}
		System.out.println("The maximum frequency of number :" + ac + " is " +count1);
		return 2.0d;
	}

	public static void main(String[] args) {
		FreqAssignment2.method21();
		//method();
//CopyAssignment1 abc=new CopyAssignment1();
//abc.method1();
	}

}
