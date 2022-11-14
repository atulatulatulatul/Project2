package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import Base.TestBase;
import net.bytebuddy.utility.RandomString;

public class ReadData extends TestBase {
	
	

// Used static then you are able to call the class and method name from other package
	public static String readPropertyFile(String value) throws Exception
	{
		//Create a Object and you need to pass the locations of Property file where all the important data store
		Properties pop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\test\\w space\\FirstSeleFrameProject1\\TestData\\Configure.property");
		pop.load(file);
		return pop.getProperty(value);
		
	}
	
	public static String readExcelFile(int rownum, int cellnum) throws Exception
	{
		FileInputStream file = new FileInputStream("C:\\Users\\test\\w space\\FirstSeleFrameProject1\\TestData\\sauceinfohardcode.xlsx");
		Sheet Excel = WorkbookFactory.create(file).getSheet("Sheet1");
		String Value = Excel.getRow(rownum).getCell(cellnum).getStringCellValue();
		return Value; 
	}
	
	public static void Screenshots(String img ) throws IOException
	{
		File xx = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String img1 = RandomString.make(1);
		File d = new File("C:\\Users\\test\\w space\\FirstSeleFrameProject1\\Screenshots/image"+img1+".jpeg");
		FileHandler.copy(xx, d);		
		
	}
	

}
