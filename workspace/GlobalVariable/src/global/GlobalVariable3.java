package global;

public class GlobalVariable3 {
static double radius;
double area;
char grade;
int payment=50000;
	public static void main(String[] args) {
		GlobalVariable3 a2;
		a2 = new GlobalVariable3();
		System.out.println("Program Starts ....");
		System.out.println("Direct accses...");
		System.out.println("The radius of the circle is:"+radius);
		System.out.println("The radius of the circle is:"+GlobalVariable1.radius);
		System.out.println("The payment is:"+a2.payment);
		System.out.println("The grade is:"+a2.grade);
		System.out.println("Standard method of accses...");
		System.out.println("The radius of the circle is:"+radius);
		System.out.println("The radius of the circle is:"+GlobalVariable1.radius);
		radius=50.0;
		a2.payment=10;
		a2.grade='a';
		System.out.println("The payment is:"+a2.payment);
		System.out.println("The grade is:"+a2.grade);
		System.out.println("The radius of the circle is:"+radius);
		System.out.println("The radius of the circle is:"+GlobalVariable1.radius);
		System.out.println("Program Ends ....");
		

	}

}
