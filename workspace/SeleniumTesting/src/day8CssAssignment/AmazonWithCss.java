package day8CssAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonWithCss {

	public static void main(String[] args) throws InterruptedException {
		String Path="D:\\Testing\\automation\\workspace\\SeleniumTesting\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement signin=driver.findElement(By.cssSelector(".nav-line-1-container"));
		signin.click();
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.cssSelector("input[type='email']"));
		email.sendKeys("8605802008");
		WebElement Continue=driver.findElement(By.cssSelector("input[id='continue']"));
		Continue.click();
		WebElement password=driver.findElement(By.cssSelector(".a-input-text.a-span12.auth-autofocus.auth-required-field"));
		password.sendKeys("Family@11");
		WebElement Signinn=driver.findElement(By.cssSelector(".a-button-input"));
		Signinn.click();
		Thread.sleep(1000);
		String Title=driver.getTitle();
		System.out.println("The title of page   :"+Title);
		WebElement amazonPay=driver.findElement(By.cssSelector(" #nav-xshop > a:nth-child(2)"));
		amazonPay.click();
		String titleOfpay=driver.getTitle();
		System.out.println("Title of the amazon pay page  : "+titleOfpay);
		driver.navigate().back();
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals(Title)) {
			System.out.println("Both titles are same");
		}else {
			System.out.println("Both titles are not same");
		}
		driver.close();

	}

}
