package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertiess3 {

	public static void main(String[] args) throws IOException {
		String A="D:\\Testing\\automation\\workspace\\Practice\\propertypractice2\\propPractice3.properties";
		FileInputStream b1=new FileInputStream(A);
		Properties b2=new Properties();
		b2.load(b1);System.out.println(b2.getProperty("lastname"));
		

	}

}
