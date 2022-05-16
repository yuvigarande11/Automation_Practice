package constructor;

class Consoverloading2 {
	static int age;
	double salary;
	Consoverloading2() {
		System.out.println("============Zero- Parameterized Constructor started============");
		System.out.println(" having no parameters");
		System.out.println("============Zero- Parameterized Constructor Ends....============");	
	}	
	Consoverloading2(int a) {
		System.out.println("============int Parameterized Constructor started============");
		System.out.println(" having int parameters");
		age=a;
		System.out.println("============int Parameterized Constructor Ends....============");
	}
	Consoverloading2(double b) {
		System.out.println("============double Parameterized Constructor============");
		System.out.println(" having double parameters");
		salary=b;
		System.out.println("============double- Parameterized Constructor Ends....============");
	}
	Consoverloading2(int a, double b) {
		System.out.println("============int-double Parameterized Constructor started============");
		System.out.println(" having int-double parameters");
		age=a;
		salary=b;
		System.out.println("============int-double Parameterized Constructor Ends....============");
	}
	public static void main(String args[]) {
		Consoverloading2 pc1 = new Consoverloading2();
		System.out.println("After Zero-para constructor,Age= "+pc1.age);//0
		System.out.println("After Zero-para constructor,Salary= "+pc1.salary);//0.0		

		Consoverloading2 pc2 = new Consoverloading2(33);
		System.out.println("After int-para constructor,Age= "+pc2.age);//33
		System.out.println("After int-para constructor,Salary= "+pc2.salary);//0.0
		
		Consoverloading2 pc3 = new Consoverloading2(34000.34);
		System.out.println("After double-para constructor,Age= "+pc3.age);//33
		System.out.println("After double-para constructor,Salary= "+pc3.salary);//34000.34
		
		Consoverloading2 pc4 = new Consoverloading2(30,95000.34);
		System.out.println("After int-double-para constructor,Age= "+pc4.age);//30
		System.out.println("After int-double-para constructor,Salary= "+pc4.salary);//95000.34
	}
}