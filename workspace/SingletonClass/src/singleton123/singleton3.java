package singleton123;

class salary{
	private salary() {
		int sal=9000000;
		System.out.println("salary is"+sal);
	}
	static private salary a1=new salary();
	int salary=22222;
	char b='a';
	static salary getInstance() {
		return a1;
	}
}

public class singleton3 {

	public static void main(String[] args) {
		salary b1=salary.getInstance();
		
		
	}

}
