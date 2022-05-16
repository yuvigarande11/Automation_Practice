package CssAssignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssAssignment2 {

	public static void main(String[] args) {

		String Path="D:\\Testing\\automation\\workspace\\SeleniumTesting\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.espncricinfo.com/");
		List<WebElement> menu=driver.findElements(By.cssSelector("div.ds-flex.ds-items-center.ds-justify-between.ds-flex-1"));
		for(WebElement element:menu) {
			System.out.println(element.getText());
		}

	}

}
