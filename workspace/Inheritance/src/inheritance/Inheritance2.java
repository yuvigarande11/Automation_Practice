package inheritance;

class A1{int a=10;
static int b=12;
	
}
class B1 extends A1{ double c=10.2;
		
		static double d=100.4;
}
class C1 extends B1{ int d=11;
}



public class Inheritance2 {

	public static void main(String[] args) {
		
		System.out.println("Class A1 static variable: "+A1.b);
		System.out.println("Class B1 static variable: "+B1.d);
		C1 c11=new C1();
		System.out.println("Class C1 non static variable: "+c11.d);
		System.out.println("Class C1 non static variable: "+c11.c);
		System.out.println("Class C1 non static variable: "+c11.a);
	}

}
