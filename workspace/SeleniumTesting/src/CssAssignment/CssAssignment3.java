package CssAssignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssAssignment3 {

	public static void main(String[] args) throws InterruptedException {

		String Path="D:\\Testing\\automation\\workspace\\SeleniumTesting\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement list1=driver.findElement(By.cssSelector("#description > span"));
		//Thread.sleep(5000);
				list1.sendKeys("cricket");
	//	List<WebElement> menu=driver.findElements(By.cssSelector("#inputWrapper"));
		//for(WebElement element:menu) {
			//System.out.println(element.getText());
		//}

	}

}
