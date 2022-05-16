package day9CssAssignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartWithCss {

	public static void main(String[] args) throws InterruptedException {
		String Path="D:\\Testing\\automation\\workspace\\SeleniumTesting\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		
		WebElement cancle=driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z"));
		cancle.click();
		List<WebElement> menu=driver.findElements(By.cssSelector("div._331-kn._2tvxW>div>div>div"));
		Thread.sleep(1000);
		System.out.println("Total menu optios are  :"+menu.size());
		for(WebElement option:menu) {
			System.out.println(option.getText());
		}
			

	}

}
