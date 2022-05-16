package singleton123;


class abc{
	private abc() {
		System.out.println("Private cons.");
	}
	static private abc d2=new abc();
	String a="pune";
	static abc getInstance() {
		return d2;
	}
}
public class singleton2 {

	public static void main(String[] args) {
		abc a1=abc.getInstance();
		System.out.println(a1.a);
		a1.a="mumbai";
		System.out.println(a1.a);
		
	}

}
