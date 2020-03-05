package OLB;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import resources.base;

public class RubyOnRailsHomePage_TEST extends base {
	private static Logger log = LogManager.getLogger(RubyOnRailsHomePage_TEST.class.getName());
	
	// validating we open the browser and open url
	@Test(priority = 1)
	public void launchBrowser_URL() throws IOException {
		driver = initializeDriver();
		String url = prop.getProperty("url");
		driver.get(url);
		log.info("Navigated to Ruby on Rails girHome page");
	}
	
	
	// validate Sign-in and Sign-up links is visible and clickable 
	@Test(priority = 2)
	public void validateSignIn() throws IOException {
		HomePage hp = new HomePage(driver);
		boolean isSignInVisible = hp.getSignIn().isDisplayed();
		Assert.assertTrue(isSignInVisible);
		log.info("Sign In is visible");
		log.error("Sign In is invisible");
	}
	
	@Test(priority = 3)
	public void validateSignUp() throws IOException {
		HomePage hp = new HomePage(driver);
		boolean isSignUpVisible = hp.getSignUp().isDisplayed();
		Assert.assertTrue(isSignUpVisible);
		log.info("Sign Up is visible");
		log.error("Sign Up is invisible");
	}
	
	// validate Ruby on Rails along well with url=http://rubyonrails.org/
	@Test(priority = 4)
	public void validateRubyOnRailsText() throws IOException {
		HomePage hp = new HomePage(driver);
		String expectedtext="Ruby on Rails";
		String actualText = hp.rubyOnRails.getText();
		Assert.assertEquals(actualText, expectedtext);
		log.info("Ruby on Rails is displayed on Ruby GIT homePage");
		log.error("Ruby on Rails is NOT displayed on Ruby GIT homePage");
	}
	
	@Test(priority = 5)
	public void validateRubyOnRailsURL() throws IOException {
		HomePage hp = new HomePage(driver);
		String expectedURL="http://rubyonrails.org/";
		String actualURL = hp.getRubyLink().getText();
		Assert.assertEquals(actualURL, expectedURL);
		log.info("Ruby on Rails official URL is displayed on Ruby GIT homePage");
		log.error("Ruby on Rails official URL is NOT displayed on Ruby GIT homePage");
	}
	
	
	// Verify "Grow your team on GitHub" disclosure with "Dismiss" link
	
	
	// validate top languages

	// we can have a endless scenarios, however i just do highlevel scenarios
	
	//close the browser
	@AfterTest 
	public void closeBrowser() throws IOException{
		driver = initializeDriver();
		driver.close();
		log.info("Browser is closed properly");
		log.error("Browser is NOT closed properly");
	}
	//span[@class='ml-0 mr-2']//span[contains(text(),'')]//span[@itemprop='programmingLanguage']
	
	
}
