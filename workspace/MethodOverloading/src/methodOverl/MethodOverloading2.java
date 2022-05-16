package methodOverl;

public class MethodOverloading2 {
		static int addition() 
		{int num1=10,num2=10;
		int add =num1+num2;
		return add;
			
		}
		
			
		
		static int addition(int num1,int num2) 
		{
		int add =num1+num2;
		return add;
			
		}
		static double addition(double num1) 
		{
		double add =num1+num1;
		return add;
			
		}
	public static void main(String[] args) {
		System.out.println("*********** \t***********");
		
		addition();
		
		System.out.println("The addition is\t"+MethodOverloading2.addition(30,50));
		System.out.println("The addition is\t"+addition(30,50));
		System.out.println("The addition is\t"+MethodOverloading2.addition(30.80));
		

	}

}
