package day9CssAssignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArenaWithCss {

	public static void main(String[] args) throws InterruptedException {
		String Path = "D:\\Testing\\automation\\workspace\\SeleniumTesting\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.gsmarena.com/");
	//	Thread.sleep(2000);
		List<WebElement> finder = driver
				.findElements(By.cssSelector("div[class='brandmenu-v2 light l-box clearfix']>ul>li"));
		System.out.println("No of mobile companies :" + finder.size());
		for (WebElement phones : finder) {
			System.out.println(phones.getText());
		}
		driver.close();

	}

}
