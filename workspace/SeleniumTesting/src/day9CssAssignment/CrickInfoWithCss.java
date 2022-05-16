package day9CssAssignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrickInfoWithCss {

	public static void main(String[] args) {
		String Path="D:\\Testing\\automation\\workspace\\SeleniumTesting\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.espncricinfo.com/");
		 WebElement notnow=driver.findElement(By.cssSelector("#wzrk-cancel"));
		 notnow.click();
	 List<WebElement> menu=driver.findElements(By.cssSelector("div[class='ds-flex ds-flex-row'] >div>a"));
	 System.out.println("The number of options  :"+menu.size());
	 for(WebElement options:menu)
	 {System.out.println(options.getText());
		 
	 }
	 
			

	}

}
