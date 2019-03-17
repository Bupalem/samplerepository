package amazonTestcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;

public class DataSheet {
	static String userid;
	static String upassword;
@Test
	public void datatest() throws IOException {
		// TODO Auto-generated method stub
		 File f =new File("F:\\eclipse\\testData.xls");
		  FileInputStream fis= new FileInputStream(f);
		HSSFWorkbook wb =new HSSFWorkbook(fis);
		HSSFSheet sh= wb.getSheet("Amazon");
		 userid= sh.getRow(1).getCell(0).getStringCellValue();
		upassword=sh.getRow(1).getCell(1).getStringCellValue();
		System.out.println("DAta in 1st row and 1st column: "+userid+" pass "+ upassword );
		
	}

}
