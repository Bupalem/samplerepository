package amazonTestcases;

import org.testng.annotations.Test;

import amazon.HomePageObjects;
import amazon.LoginPageObjects;
import resources.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class CompleteOrderTest extends base {
	WebDriver driver;
	String userid;
	String upassword;
	@Test
	public void loginmethod() {
		// creating object to that class and invoke methods of it	
		HomePageObjects hpo = new HomePageObjects(driver);
		hpo.signin_nav();
		hpo.Signin_button().click();
		LoginPageObjects lpo = new LoginPageObjects(driver);
		lpo.username().sendKeys(userid);
		lpo.continue_button().click();
		lpo.upassword().sendKeys(upassword);
		lpo.ulogin().click();
		System.out.println("loginsuccessful");
		//Orderflow();
		//hpo.searchfun().sendKeys("T-shirt for men"+Keys.ENTER);
		}
	
	@BeforeMethod
	public void initalsite() throws IOException {

		driver = initializeDriver();
		 File f =new File("F:\\eclipse\\testData.xls");
		FileInputStream fis= new FileInputStream(f);
		HSSFWorkbook wb =new HSSFWorkbook(fis);
		HSSFSheet sh= wb.getSheet("Amazon");
	//	Double flvalue=sh.getRow(1).getCell(0).getNumericCellValue();
		 userid= sh.getRow(1).getCell(0).getStringCellValue();
			upassword=sh.getRow(1).getCell(1).getStringCellValue();
			System.out.println("DAta in 1st row and 1st column: "+userid+"pass"+upassword );
			driver.get(prop.getProperty("weburl"));
		
	}
	
	public void Orderflow(){
		
	}
	
	
	

}
