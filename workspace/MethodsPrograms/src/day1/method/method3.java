package day1.method;

public class method3 {
	static double addition(double num1,double num2) {
		System.out.println("Number1 is: "+num1);
		System.out.println("Number2 is: "+num2);
		double res = num1+num2;
		return res;
	}
	public static void main(String[] args) {
		double a;
		System.out.println("The additon is "+addition(28,50));
		System.out.println("The additon is "+addition(2,50));
		double sum=addition(28,50);
			a=sum*2*10/123;
	System.out.println("The final is "+a);

	}
	
}
