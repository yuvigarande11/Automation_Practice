package day9CssAssignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleWithCss {

	public static void main(String[] args) throws InterruptedException {
		String Path = "D:\\Testing\\automation\\workspace\\SeleniumTesting\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	//	WebElement data=driver.findElement(By.cssSelector("input.gLFyf.gsfi"));
		WebElement data=driver.findElement(By.cssSelector("input[jsaction='paste:puy29d;']"));
		data.sendKeys("cricket");
		Thread.sleep(1000);
	//	List<WebElement> search=driver.findElements(By.cssSelector("div>ul>div>ul>li "));
		List<WebElement> search=driver.findElements(By.cssSelector("div[class='mkHrUc']>ul>div>ul>li "));
		
		System.out.println("The total suggestions  :"+search.size());
	System.out.println("The search suggestions are ");
	//try {
	for(int i=0;i<search.size();i++) {
		System.out.println(search.get(i).getText());
	}
//	//}
//	catch(Throwable e) {
//		System.out.println("Exception "+e);
//		//driver.close();
//	}
	
	
	

	driver.close();
	}

}
