package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3Automate {

	public static void main(String[] args) {
		String Path = "D:\\Testing\\automation\\workspace\\SeleniumTesting\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path);
		WebDriver driver = new ChromeDriver();
		driver.get("https://demosite.executeautomation.com/Login.html");
		String ActualUrl = driver.getCurrentUrl();
		System.out.println("The Actual url is : " + ActualUrl);
		System.out.println("The length of Actual Url : " + ActualUrl.length());
		String ExpectedUrl = "https://demosite.executeautomation.com/Login.html";
		System.out.println("The Expected Url is : " + ExpectedUrl);
		if (ActualUrl.equals(ExpectedUrl)) {
			System.out.println("The both Urls are same");

		} else {
			System.out.println("The both Urls are not same");

		}
		String Titlee=driver.getTitle();
		System.out.println("The Actual Title :"+Titlee );
		System.out.println("The length of Actual Title :"+Titlee.length() );
		WebElement userIPfield=driver.findElement(By.name("UserName"));
		userIPfield.sendKeys("execution");
		WebElement UserOPfield=driver.findElement(By.name("Password"));
		UserOPfield.sendKeys("admin");
		WebElement Loginbutton=driver.findElement(By.name("Login"));
		Loginbutton.click();
		//driver.close();
		
		
		
		
		
	}

}
