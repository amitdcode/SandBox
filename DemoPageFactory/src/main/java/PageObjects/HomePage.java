package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
	
	super(driver);
	}
	
	@FindBy(xpath = "//a[contains(@href, 'register')]")
	public WebElement newUserRegister;
	
	 //Go to Homepage
    public void goToFPL (){
        driver.get("https://fantasy.premierleague.com/");
        
    }
    
    public void verifyHomePage() {
    	
    	Assert.assertTrue(newUserRegister.isDisplayed());
    }
    
    
 

 }


