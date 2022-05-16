package testingClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
public class Operations2 {

	public static void main(String[] args) {
		String path1 = "D:\\Testing\\automation\\workspace\\SeleniumTesting\\executables\\chromedriver.exe";
		
		
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver=new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();// with generic
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		String currenadd=driver.getCurrentUrl();
		System.out.println(currenadd);
		String expectedad="https://demo.vtiger.com/vtigercrm/index.php";
		System.out.println(expectedad);
		if(currenadd.equals(expectedad)) {
			System.out.println("the url are same");
		}
		else {
			System.out.println("the url are not same");
		}
		String ActualTitle=driver.getTitle();
		System.out.println(ActualTitle);
		String Expected ="vtiger";
		if(Expected.equals(ActualTitle)) {
			System.out.println("the title is same");
		}
		else {
			System.out.println("the title is not same");
		}
		String sourceCont=driver.getPageSource();
		System.out.println(sourceCont.length());
	//	System.out.println(sourceCont);
		WebElement userIPfield=driver.findElement(By.id("username"));
		System.out.println(" Is displayed"+userIPfield.isDisplayed());
		//System.out.println(" Is selected "+userIPfield.isSelected());
		System.out.println(" Is enabled "+userIPfield.isEnabled());
		userIPfield.sendKeys("admin");
		WebElement UserOPfield=driver.findElement(By.id("password"));
		System.out.println(" Is displayed"+UserOPfield.isDisplayed());
	//	System.out.println(" Is selected "+UserOPfield.isSelected());
		System.out.println(" Is enabled "+UserOPfield.isEnabled());
		UserOPfield.sendKeys("Test@123");
		WebElement Loginbutton=driver.findElement(By.cssSelector("#loginFormDiv > form > div:nth-child(6) > button"));
		System.out.println(" Is displayed"+Loginbutton.isDisplayed());
		//System.out.println(" Is selected "+Loginbutton.isSelected());
		System.out.println(" Is enabled "+Loginbutton.isEnabled());
		Loginbutton.click();
		
		//	driver.close();
		
	}

}
