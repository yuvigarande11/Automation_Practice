package constructor;

public class Consoverloading3 {//metod overloading example
	/* fix the error in */

	double sum(int g, int h) {
		System.out.println(g + h);
		return (g + h);
	}

	double sum(int g, double h) {
		System.out.println(g + h);
		return (g + h);
	}

	public static void main(String args[]) {
		Consoverloading3 ob = new Consoverloading3();
		double result = ob.sum(20, 20);//40
		double result2 = ob.sum(20, 20.56);//40.56

	}
}