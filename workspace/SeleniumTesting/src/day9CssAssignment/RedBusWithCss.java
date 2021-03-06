package day9CssAssignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusWithCss {

	public static void main(String[] args) throws InterruptedException {
		String Path="D:\\Testing\\automation\\workspace\\SeleniumTesting\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		WebElement from=driver.findElement(By.cssSelector("input[data-message='Please enter a source city']"));
		from.clear();
		from.sendKeys("pune");
		driver.findElement(By.cssSelector("ul.autoFill.homeSearch>li.selected")).click();
		WebElement to=driver.findElement(By.cssSelector("input[data-message='Please enter a destination city']"));
		to.clear();
		to.sendKeys("solapur");
		WebElement to1=driver.findElement(By.cssSelector(".selected"));
		to1.click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#onward_cal")).click();
		driver.findElement(By.cssSelector("td.next")).click();
		driver.findElement(By.cssSelector(".rb-monthTable.first.last>tbody>:nth-child(4)>:nth-child(6)")).click();
		driver.findElement(By.cssSelector(".fl.button")).click();
		//After 6pm checkbox
		driver.findElement(By.cssSelector("div.details>:nth-child(3)>:nth-child(4)>.custom-checkbox")).click();
		//AC check box
		driver.findElement(By.cssSelector("ul.list-chkbox>:nth-child(3)>:nth-child(2)")).click();
		Thread.sleep(500);
		WebElement NoOfBuses=driver.findElement(By.cssSelector("div.sort-results.w-80.fl>:nth-child(5)>:first-child>:first-child>:first-child"));
	System.out.println(NoOfBuses.getText());
	//	List<WebElement> buses=driver.findElements(By.cssSelector("div[scrollthreshold='1']>ul>div"));
	//	System.out.println("The number of buses found is :"+buses.size());
		//driver.close();

	}

}
