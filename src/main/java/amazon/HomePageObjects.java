package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import resources.base;

public class HomePageObjects {

public WebDriver driver;
	
	By signin_nav=By.id("nav-link-yourAccount");
	By myorders= By.linkText("Your Orders");
	By signin_button=By.xpath("//a/span[@class='nav-action-inner']");
	By searchfun= By.xpath("//*[@id='twotabsearchtextbox']");
		
	public HomePageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		}

	public void signin_nav()
	{	
		Actions act =new Actions(driver);
	 act.moveToElement(driver.findElement(signin_nav)).build().perform();
		}
	
	public WebElement Signin_button(){
	return driver.findElement(signin_button);
	}

	public WebElement getmyorders()
	{
		return driver.findElement(myorders);
		
	}
	public WebElement searchfun()
	{
		return driver.findElement(searchfun);
		
	}
/*	
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}
*/	
	
	
}
