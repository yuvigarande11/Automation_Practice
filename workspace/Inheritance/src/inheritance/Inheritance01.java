package inheritance;

class A{
	static int ab=100;
	int abc=10;
	double pq=101;
}
class B{
	static int bc=67;
	double cd=982.82;
	int ef=87;
}
class C{ static double gh=78.98;
		float hi=23.04f;
}



public class Inheritance01 {

	public static void main(String[] args) {
		System.out.println(" static variables:"+A.ab);
		System.out.println(" static variables:"+B.bc);
		System.out.println(" static variables:"+C.gh);
		B b1=new B();
		A a1 =new A();
		C c1=new C();
		System.out.println("non static variables:"+a1.abc);
		System.out.println("non static variables:"+a1.pq);
		System.out.println("non static variables:"+b1.cd);
		System.out.println("non static variables:"+b1.ef);
		System.out.println("non static variables:"+c1.hi);

	}

}
