package CssAssignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CssAssignment {

	public static void main(String[] args) throws InterruptedException {
		String Path="D:\\Testing\\automation\\workspace\\SeleniumTesting\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path);
		// step2: create an instance of Chrome Browser
				WebDriver driver = new ChromeDriver();
				// maximize browser
				driver.manage().window().maximize();
				// implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

				driver.get("https://www.demoblaze.com/");

				List<WebElement> phones = driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));

				System.out.println("Number of Phones present on Home page: "+phones.size());
				for(WebElement element:phones) {
					System.out.println(element.getText());
				}
			}

		}