package amazonTestcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import amazon.HomePageObjects;
import amazon.LoginPageObjects;
import amazon.YourordersObjects;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class YourOrdersTestcase extends base {
	WebDriver driver;
	String result;
	@BeforeTest
	public void initialize() throws IOException {

		//driver = initializeDriver();
		CompleteOrderTest cot= new CompleteOrderTest();
		cot.initalsite();
		cot.loginmethod();
		driver=cot.driver;
		
	}
	@Test
	public void yourOrderstest() throws IOException {
		// one is inheritance
		// creating object to that class and invoke methods of it
		/*driver.get(prop.getProperty("weburl"));
		HomePageObjects hpo = new HomePageObjects(driver);
		hpo.signin_nav();
		hpo.getmyorders().click();
		LoginPageObjects lpo = new LoginPageObjects(driver);
		lpo.username().sendKeys("**********");
		lpo.continue_button().click();
		lpo.upassword().sendKeys("*******");
		lpo.ulogin().click();*/
		//CompleteOrderTest cot= new CompleteOrderTest();
		HomePageObjects hpo= new HomePageObjects(driver);
		hpo.signin_nav();
		hpo.getmyorders().click();
		getScreenshot();
		YourordersObjects yob= new YourordersObjects(driver);
		//yob.selectdropdown();
		
	}
	@AfterMethod
	public void closeweb(){
		//driver.close();
	}
}
