package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Portalhome {
	
	WebDriver driver;

	public  Portalhome(WebDriver driver)
	{
		 this.driver=driver;
	
	}	
	
	By search=By.xpath("//input[@name='query']");
	
	
	
	public WebElement search()
	{
		return driver.findElement(search);
	}
	
	
	
	
	
	
	
	
	
	
	
}
