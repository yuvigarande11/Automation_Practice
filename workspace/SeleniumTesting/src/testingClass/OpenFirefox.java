package testingClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	public static void main(String[] args) {
		String path1 = "D:\\Testing\\automation\\workspace\\SeleniumTesting\\executables\\geckodriver.exe";
		String path2 = ".\\executables\\geckodriver.exe";
		String path3 = System.getProperty("user.dir") + "\\executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path1);
		 FirefoxDriver b=new FirefoxDriver();
		//WebDriver a = new FirefoxDriver();// with generic

		b.get("https://www.google.com");
		String currenadd=b.getCurrentUrl();
		System.out.println(currenadd);
		String expectedad="www.google.com";
		System.out.println(expectedad);
		if(currenadd.equals(expectedad)) {
			System.out.println("the url are same");
		}
		else {
			System.out.println("the url are not same");
		}
		String ActualTitle=b.getTitle();
		System.out.println(ActualTitle);
		String Expected ="Google";
		if(Expected.equals(ActualTitle)) {
			System.out.println("the title is same");
		}
		else {
			System.out.println("the title is not same");
		}
		String sourceCont=b.getPageSource();
		System.out.println(sourceCont);
		b.close();
	}

}
