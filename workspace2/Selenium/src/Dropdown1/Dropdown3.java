package Dropdown1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.SeleniumUtility;

public class Dropdown3 {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome","http://demo.automationtesting.in/Register.html");
		WebElement Signin=driver.findElement(By.cssSelector("button[type='submit']"));
		String  fontsize=Signin.getCssValue("font-size");
		String  color=Signin.getCssValue("color");
		String  backgroundcolor=Signin.getCssValue("background-color");
System.out.println(fontsize+"     "+color+"     "+backgroundcolor);	
	
	
	}

}
