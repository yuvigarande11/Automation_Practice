package mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utility.SeleniumUtility;

public class Mouse1 {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("Chrome", "http://demo.automationtesting.in/Register.html");
		
		WebElement FirstName=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		FirstName.sendKeys("admin");
		WebElement LastName=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
	
		Actions act=new Actions(driver);
		act.moveToElement(FirstName).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		act.moveToElement(LastName).doubleClick().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}

}
