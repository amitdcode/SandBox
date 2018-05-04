package Tests;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.PlayerPage;

public class SampleTest extends BaseTest {
	
	@Test (priority = 0)
    public void loginTest() {

        //Initialize elements by using PageFactory
        page.GetInstance(HomePage.class).goToFPL();
        
        PlayerPage playerPage = page.GetInstance(LoginPage.class).loginToFPL("amit.deodhar@yahoo.com", "KloppLFC");
 
        //*************ASSERTIONS***********************
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@src, 'flags')]")));
        
        playerPage.verifyPlayerPage();
    }
 

}
