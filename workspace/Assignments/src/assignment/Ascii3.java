package assignment;

public class Ascii3 {

	public static void main(String[] args) {
		char cha = 'a';
		int ascii = cha;
		System.out.println("The ascii code of a is=Ascii a=" + ascii);
		System.out.println("The ascii codes from a - z");
		System.out.println("\tASCII CODE \t  ALPHABET");
		for (char alpha = 'a'; alpha <= 'z'; alpha++) {

			int asci = alpha;

			System.out.println("\t   " + asci + "\t \t \t" + alpha);
		}
		System.out.println("The ascii codes from A - Z");
		System.out.println("\tASCII CODE \t  ALPHABET");
		for (char alpha = 'A'; alpha <= 'Z'; alpha++) {

			int asci = alpha;

			System.out.println("\t   " + asci + "\t \t \t" + alpha);
		}

		/*
		 * System.out.println("The ascii codes from 0 - 9");
		 * System.out.println("\tALPHABET \t  ASCII CODE"); for(int
		 * alpha=0;alpha<=10;alpha++) {
		 * 
		 * int asci=alpha;
		 * 
		 * System.out.println("\t   "+asci+"\t \t \t"+alpha); }
		 */

	}

}
