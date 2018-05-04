package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath = "//input[contains(@id, 'username')]")
	public WebElement userName;
	
	@FindBy(xpath = "//input[contains(@id, 'password')]")
	public WebElement password;
	
	@FindBy(xpath = "//button[contains(@type, 'submit')]")
	public WebElement login;
	
    //Go to LoginPage
    public PlayerPage loginToFPL (String strUserName, String strPassword){
    	
    	writeText(userName, strUserName);
    	
    	writeText(password, strPassword);
    	
        click(login);
        //I want to chain LoginPage's methods so I return LoginPage by initializing its elements
        return new PlayerPage(driver);
	
    }
}
