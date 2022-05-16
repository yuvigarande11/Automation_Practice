package Keyboard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.SeleniumUtility;

public class Keyboard4 {

	public static void main(String[] args) throws InterruptedException {

		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("Chrome", "https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		// driver.findElement(By.cssSelector("body")).sendKeys(Keys.END);
		WebElement pagedown = driver.findElement(By.cssSelector("body"));
		for (int i = 0; i <= 16; i++) {
			Thread.sleep(2000);
			pagedown.sendKeys(Keys.PAGE_DOWN);
		}
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.HOME);
		// driver.close();

	}

}
