package Academy.E2EProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.testng.annotations.Test;

public class basetest {
	

	public static WebDriver driver=null;
	public Properties prop;

	public WebDriver invokedriver() throws IOException
	{
		 prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\E2EProject\\src\\main\\java\\Academy\\E2EProject\\data.properties");
		prop.load(fis);
		
		String browser=prop.getProperty("browser");
		
		if(browser.equals("firefox"))
		{
			
			 driver=new FirefoxDriver();
		}
		else if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("ie"))
		{
				driver=new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver;
		
		


}
	public void screenshot(String result) throws IOException {
		
		File scr= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File("D:\\Screenshot\\"+result+" screenshot.jpg"));//png or jpg
		
		
	}
}
