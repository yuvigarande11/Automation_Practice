package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2Facebook {

	public static void main(String[] args) {
		String Path1="D:\\Testing\\automation\\workspace\\SeleniumTesting\\executables\\chromedriver.exe";
		String Path2=".\\executables\\chromedriver.exe";
		String Path3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path1);
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\facebook.com");
		String Url=driver.getCurrentUrl();
		System.out.println(" Actual Url : "+Url);
		String expectedUrl="www.facebook.com";
		if(Url.contains(expectedUrl)) {
			System.out.println("Both urls are same");
		}else {
			System.out.println("Both urls are not same");
		}
		String Title=driver.getTitle();
		System.out.println("The Actual title of page  : "+Title);
		System.out.println("The length of title   : "+Title.length());
		String ExpectedTitle="facebook";
		System.out.println("Expected Title :"+ExpectedTitle);
		if(ExpectedTitle.contains(Title)) {
			System.out.println("Both Actual & Expected titles are same");
		}else {
			System.out.println("Both Actual & Expected titles are not same");
		}
		String Pagesource1=driver.getPageSource();
		System.out.println("Length of page source : "+Pagesource1.length());
		driver.close();
		
	}

}
