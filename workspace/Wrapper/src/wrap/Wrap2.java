package wrap;

public class Wrap2 {

	public static void main(String[] args) {
		int a=23;
		Integer A=23;
		Integer C=23;
		int B=C.intValue();
		System.out.println(" Equals"+A.equals(B));
		System.out.println(" =="+(A==B));
		System.out.println("  "+A.equals(B));
		

	}

}
