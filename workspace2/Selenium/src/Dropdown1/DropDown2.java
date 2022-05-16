package Dropdown1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Utility.SeleniumUtility;

public class DropDown2 {

	public static void main(String[] args) throws InterruptedException {
		
		String path="D:\\Testing\\automation\\workspace2\\Selenium\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://thompsonsj.com/bootstrap-select-dropdown/");
		WebElement drop=driver.findElement(By.cssSelector("#bsd1-button"));
		//wait.until(ExpectedConditions.elementToBeClickable(drop));
		
		Thread.sleep(2000);
		drop.click();
		List<WebElement> allOp=driver.findElements(By.cssSelector(".dropdown-menu.dropdown-menu-right.show>div>a"));
		System.out.println(allOp.size());
		for(int i=0;i<allOp.size();i++) {
			System.out.println(allOp.get(i).getText());
		}
		
	driver.close();}

}
