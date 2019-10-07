package Academy.E2EProject;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.Homepagelinks;
import pageObject.Loginlinks;

public class homePage extends basetest {
	
	@Test(dataProvider="getdata")
	
	public void homepage(String username,String password) throws IOException
	{
		driver=invokedriver();
		
		driver.get(prop.getProperty("url"));
		Homepagelinks hp=new Homepagelinks(driver);
		Loginlinks ll=new Loginlinks(driver);
				
		hp.alert().click();
		
		hp.login().click();
		
		ll.username().sendKeys(username);
		ll.password().sendKeys(password);
		ll.loginbutton().click();		
		System.out.println("login passed");
	}

	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data=new Object[2][2];
		
		data[0][0]="ilandirayan1990@gmail.com";
		data[0][1]="1234";
		data[1][0]="ilan@gmail.com";
		data[1][1]="98754";		
		return data;
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		//driver.quit();
		driver=null;
	}
	
}
