package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import PageObjects.PageGenerator;
import org.testng.annotations.*;



public class BaseTest {
	
    public WebDriver driver;
    public WebDriverWait wait;
    public PageGenerator page;
 
    @BeforeClass
    public void classLevelSetup () {
        //Create a Chrome driver. All test classes use this.
    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver.exe");
    	
        driver = new ChromeDriver();
 
        //Create a wait. All test classes use this.
        wait = new WebDriverWait(driver,15);
 
        //Maximize Window
        driver.manage().window().maximize();
 

    }
    
    @BeforeMethod
    public void methodLevelSetup() {
    	
        //Instantiate the Page Class
        page = new PageGenerator(driver);
    }
 
    @AfterClass
    public void teardown () {
        driver.quit();
    }

}
