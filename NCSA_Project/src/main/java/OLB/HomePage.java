package OLB;

import org.decimal4j.util.DoubleRounder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Sign In
	@FindBy(xpath = "//a[@class='HeaderMenu-link no-underline mr-3']")
	WebElement signIn;
	public WebElement getSignIn() {
		return signIn;
	}

	// Sign Up
	@FindBy(xpath = "//a[@class='HeaderMenu-link d-inline-block no-underline border border-gray-dark rounded-1 px-2 py-1']")
	WebElement signUp;
	public WebElement getSignUp() {
		return signUp;
	}

	//Ruby on Rails & officialLink
	@FindBy(xpath = "//h1[@class='text-gray-dark lh-condensed mb-1 mb-md-2']")
	WebElement rubyOnRails;
	public WebElement getRubyOnRails() {
		return rubyOnRails;
	}
	
	@FindBy(linkText = "http://rubyonrails.org/")
	WebElement rubyLink;
	public WebElement getRubyLink() {
		return rubyLink;
	}
	
	
	
	//Top Languages: 
	//span[@class='ml-0 mr-2']//span[@itemprop='programmingLanguage']
	
	
	
	
	
	
}
