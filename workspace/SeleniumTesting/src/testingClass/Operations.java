package testingClass;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Operations {

	public static void main(String[] args) {
		String path1 = "D:\\Testing\\automation\\workspace\\SeleniumTesting\\executables\\chromedriver.exe";
		String path2 = ".\\executables\\chromedriver.exe";
		String path3 = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		ChromeDriver b=new ChromeDriver();
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
		System.out.println(sourceCont.length());
	//	System.out.println(sourceCont);
		b.close();

	}

}
