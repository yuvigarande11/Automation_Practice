package Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.SeleniumUtility;

public class Keyboard2 {

	public static void main(String[] args) {
		
	SeleniumUtility s1=new SeleniumUtility();
	WebDriver driver=s1.setUp("Chrome","https://demo.actitime.com/login.do");
	WebElement usn=driver.findElement(By.cssSelector("input[placeholder='Username']"));
	usn.sendKeys("admin",Keys.TAB);
	WebElement pass=driver.findElement(By.cssSelector("input[placeholder='Password']"));
	pass.sendKeys("manager",Keys.ENTER);
	}

}
