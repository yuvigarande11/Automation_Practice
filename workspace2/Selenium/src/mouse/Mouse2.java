package mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utility.SeleniumUtility;

public class Mouse2 {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("Chrome", "https://www.globalsqa.com/demo-site/");
		
		List<WebElement> MainMenu=driver.findElements(By.cssSelector(""))
		
		
	}

}
