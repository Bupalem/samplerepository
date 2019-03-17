package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class YourordersObjects {

public WebDriver driver;
	
	By orderdropdown=By.id("a-autoid-1-announce");
		
	public YourordersObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		}

	/*public WebElement selectdropdown()
	{	
		driver.findElement(orderdropdown).click();
		Sel.selectByVisibleText("last 30 days");
		}
*/
}
