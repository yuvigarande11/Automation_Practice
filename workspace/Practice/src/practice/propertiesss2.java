package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertiesss2 {

	public static void main(String[] args) throws IOException {
		String a="D:\\Testing\\automation\\workspace\\Practice\\propertypractice2\\propPractice2.properties ";
		FileInputStream b=new FileInputStream(a);
		Properties c=new Properties();
		c.load(b);
		System.out.println("...."+c.getProperty("name"));
		
		

	}

}
