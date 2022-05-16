package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1WithCSS {

	public static void main(String[] args) throws InterruptedException {
		String Path1="D:\\Testing\\automation\\workspace\\SeleniumTesting\\executables\\chromedriver.exe";
		String Path2=".\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",Path1);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
	//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String ActualUrl=driver.getCurrentUrl();
		System.out.println(ActualUrl);
		String ExpectedUrl="https://demo.actitime.com/";
		if(ActualUrl.equals(ExpectedUrl)) {
			System.out.println("Both url same");
		}else {
			System.out.println("Both url not same");
			}
		String Title=driver.getTitle();
		System.out.println(Title);
		WebElement usn=driver.findElement(By.cssSelector("input#username"));
		usn.sendKeys("admin");
		WebElement pass=driver.findElement(By.cssSelector(".textField.pwdfield"));
		pass.sendKeys("manager");
		WebElement loginbutton=driver.findElement(By.cssSelector("#loginButton"));
		loginbutton.click();
		Thread.sleep(2000);
		String Title1=driver.getTitle();
		System.out.println("title after login"+Title1);
		WebElement Logout=driver.findElement(By.cssSelector("#logoutLink"));
		Logout.click();
		driver.close();
	}
	

}
