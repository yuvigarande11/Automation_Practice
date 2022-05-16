package day1.method;

public class method5 {
	public static double getintrest(int p,int t,double r) 
	{
		return (p*r*t)/100;
		
	}
	public static double getintrest1(int p,int t,double r) 
	{
		double res= (p*r*t)/100;
		return res;
		
	}
	public static void getintrest2(int p,int t,double r) 
	{
		double res= (p*r*t)/100;
		System.out.println("intrest is  "+res );
		
	}
	public static void main(String[] args) {
		System.out.println("Get total intrest using get intrest\t"+method5.getintrest(10000,1,12));
		System.out.println("Get total intrest using get intrest\t"+method5.getintrest1(20000,45,12));
		method5.getintrest2(30000,45,12); 
		
		

	}
	
}
