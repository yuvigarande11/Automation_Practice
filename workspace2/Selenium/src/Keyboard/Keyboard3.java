package Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.SeleniumUtility;

public class Keyboard3 {

	public static void main(String[] args) {

		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("Chrome", "http://demo.automationtesting.in/Register.html");
		WebElement firstname=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		firstname.sendKeys("Yuvraj",Keys.chord(Keys.CONTROL,"a"));
		firstname.sendKeys(Keys.chord(Keys.CONTROL,"C"));
		WebElement lastName=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
		lastName.sendKeys(Keys.chord(Keys.CONTROL,"v"));
	}

}
