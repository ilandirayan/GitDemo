package Academy.E2EProject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObject.Homepagelinks;

public class validateHead extends basetest{
	

	
	@Test
	public void validatehead() throws IOException
	{
		driver=invokedriver();		
		driver.get(prop.getProperty("url"));
		Homepagelinks hp=new Homepagelinks(driver);		
		hp.alert().click();
		Assert.assertEquals(hp.title().getText(), "FEATURED COURES" );
		Assert.assertTrue(hp.navbar().isDisplayed());
		System.out.println("validated content");
		
	}

	
	
@AfterTest
public void teardown() {
	driver.close();
	driver=null;
}
}

