package constructor;
class Consoverloading {
	
	Consoverloading() {
		System.out.println("Zero Parameterized Constructor");
		System.out.println(" having no parameters");
	}
	Consoverloading(int a) {
		System.out.println("Parameterized Constructor");
		System.out.println(" having int parameters");
	}
	Consoverloading(double b) {
		System.out.println("Parameterized Constructor");
		System.out.println(" having double parameters");
	}
	Consoverloading(int a, double b, int c) {
		System.out.println("Parameterized Constructor");
		System.out.println(" having int,double,int parameters");
	}	
	Consoverloading(double a, int b, int c) {
		System.out.println("Parameterized Constructor");
		System.out.println(" having double,int,int parameters");
	}
	public static void main(String args[]) {
		Consoverloading pc5 = new Consoverloading();
		Consoverloading pc1 = new Consoverloading(12);
		Consoverloading pc2 = new Consoverloading(13.34);
		Consoverloading pc3 = new Consoverloading(10,13.34,45);
		Consoverloading pc4 = new Consoverloading(13.34,23,87);
	}
}
