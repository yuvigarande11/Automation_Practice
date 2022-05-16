package global;

public class GlobalVariable1 {
static double radius;
double area;
	public static void main(String[] args) {
		System.out.println("Program Starts ....");
		System.out.println("Direct accses...");
		System.out.println("The radius of the circle is:"+radius);
		System.out.println("The radius of the circle is:"+GlobalVariable1.radius);
		System.out.println("Standard method of accses...");
		System.out.println("The radius of the circle is:"+radius);
		System.out.println("The radius of the circle is:"+GlobalVariable1.radius);
		radius=50.0;
		System.out.println("The radius of the circle is:"+radius);
		System.out.println("The radius of the circle is:"+GlobalVariable1.radius);
		System.out.println("Program Ends ....");
		

	}

}
