package assignment;

public class VowelOrConsonent7 {

	public static void main(String[] args) {

		for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
			if ((alphabet == 'a') || (alphabet == 'e') || (alphabet == 'i') || (alphabet == 'o') || (alphabet == 'u')) {
				System.out.println("\t\t\t\tThe  vowel is " + alphabet);
			} else
				System.out.println("The  consonant is " + alphabet);
		}
	}

}
