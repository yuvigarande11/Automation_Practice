package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertiess {

	public static void main(String[] args) throws IOException {
		String ab="D:\\Testing\\automation\\workspace\\Practice\\propertypractice\\prop.properties";
		String ab1=".\\propertypractice\\prop.properties";
		String ab2=System.getProperty("user.dir")+"\\propertypractice\\prop.properties";
		FileInputStream ios=new FileInputStream(ab2);
		Properties pro=new Properties();
		pro.load(ios);
		System.out.println(" The name is"+pro.getProperty("name"));
	}

}
