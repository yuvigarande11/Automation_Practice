package methodOverl;

public class MethodOverloading1 {
		static int length;
		public static void area()
		{System.out.println("The area of Square is\t");
			
		}
		public static void area(int length)
		{	int ar=length*length;
			System.out.println("the area is\t"+ar);
			
		}
		public static void area(double length)
		{	double ar=length*length;
			System.out.println("the area is\t"+ar);
			
		}
		public static void area(int length,int breadth)
		{	int ar=length*breadth;
			System.out.println("the area is\t"+ar);
			
		}
	public static void main(String[] args) {
		System.out.println("Length is \t"+length);
		MethodOverloading1.area();
		MethodOverloading1.area(20);
		MethodOverloading1.area(20,30);
		MethodOverloading1.area(12.2);
		

	}

}
