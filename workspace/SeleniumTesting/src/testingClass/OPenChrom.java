package testingClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OPenChrom {

	public static void main(String[] args) {
		String driverPath1="D:\\Testing\\automation\\workspace\\SeleniumTesting\\executables\\chromedriver.exe";
		String driverPath2=".\\executables\\chromedriver.exe";
		String DriverPath3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath1);
		WebDriver a=new ChromeDriver();
	}

}
