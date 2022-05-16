package scanner;
import java.util.Scanner;
public class Scanner2 {
	static int operation;
	static int operations(char op,int num1,int num2) {
		
		//int operation=0;
			if(op=='+') {
			 operation=num1+num2;
			}else if(op=='-') {
				 operation=num1-num2;
				}else if(op=='*') {
					operation=num1*num2;
					}else if(op=='/') {
						 operation=num1/num2;
						}
			
			return operation;
			
//				
				}
			
	public static void main(String[] args) {

		Scanner hi=new Scanner(System.in);
		System.out.println("In this program I use Scanner commands");
		System.out.println("enter the Name");
		
		String name=hi.next();
		System.out.println("Enter age");
		int age=hi.nextInt();
		System.out.println("Enter Salary");
		double Salary=hi.nextDouble();
		System.out.println("The name of the person:"+name);
		System.out.println("and his age is "+age);
		System.out.println("The Salary of "+name+" is "+Salary);
		
		
		System.out.println("Enter number 1");
		int num1=hi.nextInt();
		System.out.println("Enter number 2");
		int num2=hi.nextInt();
		System.out.println("which operation u want to perform");
		char op=hi.next().charAt(0);
		System.out.print(num1+" "+op+" "+num2+" =");
	//	System.out.println(+operations(op,num1,num2));
		Scanner2.operations(op,num1,num2);
		System.out.println("result:"+operation);
//
//		System.out.println("which operation u want to perform");
//		op=hi.next().charAt(0);
//		System.out.print(num1+" "+op+" "+num2+"=");
//		System.out.println(+operations(op,num1,num2));
//		
	}
	
}
	