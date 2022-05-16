package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		String Path1="D:\\Testing\\automation\\workspace\\SeleniumTesting\\executables\\chromedriver.exe";
		String Path2=".\\executables\\chromedriver.exe";
		String Path3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path1);
		WebDriver driverr=new ChromeDriver();
		driverr.get("https://demo.actitime.com/");
		String EnteredUrl=driverr.getCurrentUrl();
		System.out.println(EnteredUrl);
		//System.out.println("length of url  : "+EnteredUrl.length());
		String expectedUrl="www.demo.actitime.com";
		if (expectedUrl.contains(EnteredUrl)) {
			System.out.println("Actual and expected url are same");

		} else {
			System.out.println(" Actual and expected url are differenrt");
		}
		String Title=driverr.getTitle();
		System.out.println("Title of the page : "+Title);
		System.out.println("The length of title : " +Title.length());
		String SourceCont=driverr.getPageSource();
		System.out.println("Page content length : "+SourceCont.length());
		driverr.close();
	}

}
