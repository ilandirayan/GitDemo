package stepDefinitions;

import org.testng.internal.Invoker;

import Academy.E2EProject.basetest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObject.Homepagelinks;
import pageObject.Loginlinks;
import pageObject.Portalhome;

public class Stepdefinition extends basetest{
	
	@Given("^Initialize the chrome browser$")
	public void initialize_the_chrome_browser() throws Throwable {
		driver=invokedriver();
	}

	@Given("^navigate to \"([^\"]*)\" site$")
	public void navigate_to_site(String arg1) throws Throwable {
		driver.get(arg1);
	}

	@Given("^click on login button in homepage to secure signin page$")
	public void click_on_login_button_in_homepage_to_secure_signin_page() throws Throwable {
		Homepagelinks hp=new Homepagelinks(driver);
		if(hp.alertis().size()>0) {
			hp.alert().click();
		}	
		
		hp.login().click();
	}

	 @When("^users enters (.+) and (.+)$")
	    public void users_enters_and(String username, String password) throws Throwable {
		Loginlinks ll=new Loginlinks(driver);
		ll.username().sendKeys(username);
		ll.password().sendKeys(password);
		ll.loginbutton().click();		
	}

	 @Then("^verify the user loggin succussfully$")
	public void verify_the_user_loggin_succussfully() throws Throwable {
	    Portalhome ph=new Portalhome(driver);
	    Assert.assertTrue(ph.search().isDisplayed());
	    
		
	}
	 @Then("^close the browser$")
	 public void close_the_browser() throws Throwable {
		 driver.quit();
	 }

	
	
		}
	

	

