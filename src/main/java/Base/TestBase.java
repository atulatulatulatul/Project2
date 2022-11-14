package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.ReadData;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	
	public void initialization() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	driver.get("https://www.saucedemo.com/");
    	
    	
		// call the url from class=ReadData and in class you call the method=readPropertyFile 
	    //driver.get(ReadData.readPropertyFile("URL"));
    	
		
		//Read the Hardcord from ExcelSheet
//		driver.get(ReadData.readExcelFile(0, 0));
		
	}

}
