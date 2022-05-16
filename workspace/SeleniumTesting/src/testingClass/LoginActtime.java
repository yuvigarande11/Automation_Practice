package testingClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginActtime {

	public static void main(String[] args) {
		String Path="D:\\Testing\\automation\\workspace\\SeleniumTesting\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",Path);
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");

	}

}
