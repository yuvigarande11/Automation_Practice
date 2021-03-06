package Dropdown1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.switchTo().frame("iframeResult");
		WebElement dropDown=driver.findElement(By.cssSelector("select[name='cars']"));
		Select s1=new Select(dropDown);
		List<WebElement> option=s1.getOptions();
		System.out.println("The size of the options : "+option.size());
		for(WebElement op:option) {
			System.out.println(op.getText());
		}
			s1.selectByVisibleText("Volvo");
			s1.selectByValue("opel");
			s1.selectByIndex(3);
			
			List<WebElement> selectedoption=s1.getAllSelectedOptions();

		for(WebElement op2:selectedoption) {
			System.out.println(op2.getText());
		
		
		}
		s1.deselectAll();
	}

}