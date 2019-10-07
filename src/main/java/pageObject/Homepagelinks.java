package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepagelinks {
	
	WebDriver driver;
	
	public  Homepagelinks(WebDriver driver)
	{
		 this.driver=driver;
	
	}
	
	By alert=By.xpath("//*[@id=\"homepage\"]/div[5]/div[2]/div/div/div/span/div/div[6]/div/div/button");
	By login=By.xpath("//div[@class='tools']/div/nav/ul/li[4]/a");
	By title=By.xpath("//div[@class='text-center']/h2");
	By navbar=By.xpath("//*[@id=\"homepage\"]/header/div[2]/div/nav/ul/li[8]/a");
	
	public WebElement alert()
	{
		return driver.findElement(alert);
	}
	public List<WebElement> alertis()
	{
		return driver.findElements(alert);
	}
	
	
	public WebElement login()
	{
		return driver.findElement(login);
	}
	
	public WebElement title()
	{
		return driver.findElement(title);
	}
	
	

	public WebElement navbar() {
		// TODO Auto-generated method stub
		return driver.findElement(navbar);
	}
}
