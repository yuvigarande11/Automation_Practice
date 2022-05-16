package day8CssAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class DemositeWithCss {

	public static void main(String[] args) throws InterruptedException {
	//	String Path="D:\\Testing\\automation\\workspace\\SeleniumTesting\\executables\\geckodriver.exe";
		//System.setProperty("webdriver.gecko.driver", Path);
		//WebDriver driver=new FirefoxDriver();
		String Path="D:\\Testing\\automation\\workspace\\SeleniumTesting\\executables\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", Path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demosite.executeautomation.com/Login.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String LoginpageTitle=driver.getTitle();
		System.out.println("The login page title  :"+LoginpageTitle);
		System.out.println("Length of login page title"+LoginpageTitle.length());
		String ActualUrl=driver.getCurrentUrl();
		String ExpectedUrl="https://demosite.executeautomation.com/Login.html";
		if(ActualUrl.equals(ExpectedUrl)) {
			System.out.println("Both urls are same");
			
		}else {
			System.out.println("Both Urls are not same");
			
		}
		Thread.sleep(2000);
		WebElement usrn=driver.findElement(By.cssSelector("input[name='UserName']"));
		usrn.sendKeys("exceution");
		WebElement pass=driver.findElement(By.cssSelector("input[name='Password']"));
		pass.sendKeys("admin");
		WebElement loginbutton=driver.findElement(By.cssSelector("input[name='Login']"));
		loginbutton.click();
		Thread.sleep(2000);
		String CurrentUrl=driver.getCurrentUrl();
		System.out.println("Current Url1  :"+CurrentUrl);
		WebElement Logout=driver.findElement(By.cssSelector("html>body>div#cssmenu>ul>li>a>span"));
		Logout.click();
		driver.close();
	}

}
