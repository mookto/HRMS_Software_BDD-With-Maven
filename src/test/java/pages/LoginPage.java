package pages;
import org.openqa.selenium.WebDriver;
import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.WebDriverWait;
public class LoginPage {
	WebDriver driver;
	
	 public LoginPage(WebDriver driver) throws InterruptedException {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	       
	    }
    @FindBy(id = "email-login")
    WebElement txtUserName;
    @FindBy(name="password")
    WebElement txtPassword;
    @FindBy(css = "[type=submit]")
    WebElement btnSubmit;
	
   

    public void open(String url) {
        driver.get(url);
    }
    
    public void login(String user, String pass) {
    	
    	 txtUserName.sendKeys(user);
         txtPassword.sendKeys(pass);
         btnSubmit.click();
    }
}
