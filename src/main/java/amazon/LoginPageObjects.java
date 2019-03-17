package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	public WebDriver driver;
	public LoginPageObjects(WebDriver driver){
		this.driver = driver;
	}
	
	By userid=By.id("ap_email");
	By continuebutton=By.id("continue");
	By password=By.id("ap_password");
	By login = By.id("signInSubmit");
	
	public WebElement username(){
		return driver.findElement(userid);
	}
	public WebElement continue_button(){
		return driver.findElement(continuebutton);
	}
	public WebElement upassword(){
		return driver.findElement(password);
	}
	
	public WebElement ulogin(){
		return driver.findElement(login);
	}
	
	
	
}
