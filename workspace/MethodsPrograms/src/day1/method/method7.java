package day1.method;

public class method7 {
	 static void addition(double p,double r) 
	{
		double res =p+r;
		System.out.println("result is-"+res);
		
	}
	 static int addition1(int p,int r) 
		{
			int res =p+r;
			System.out.println("The result is "+res);
			return res;
		}
	
	public static void main(String[] args) {
		method7.addition(10000,11111);
		
		System.out.println("The result is "+method7.addition1(12, 8));
		method7.addition(30000,4512); 
		
		method7.addition(30000,4512);

	}
	
}
