
package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	public WebDriver driver;
	
	public BasePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*public BasePage(WebDriver driver, WebDriverWait wait, ExpectedCondition<?> condition) {
		
		this.driver = driver;
		wait.until(condition);
		PageFactory.initElements(driver, this);
	}*/

}