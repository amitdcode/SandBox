package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.*;

public class PlayerPage extends BasePage {
	
	public PlayerPage(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath = "//a[contains(@href, 'profile')]")
	public WebElement userProfile;
	
	@FindBy(xpath = "//a[contains(@href, 'details')]")
	public WebElement teamDetails;
	
	
	//Verify landing on Player Page 
	public void verifyPlayerPage() {
		
		Assert.assertTrue(userProfile.isDisplayed());
	}
	
	
	public void goToUserProfile() {
		
		click(userProfile);
	}
	

}
