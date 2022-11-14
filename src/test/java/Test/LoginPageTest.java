package Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Page.LoginPage;
import Utility.ReadData;

public class LoginPageTest extends TestBase {
	
	LoginPage login;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		login = new LoginPage();
	}
	
	@Test(enabled=false)
	public void verifyURLTest() throws Exception
	{
		String CurrentURL = login.verifyURL();
		Assert.assertEquals(CurrentURL, "https://www.saucedemo.com/");
		
		//call the CurrentUURL from class=ReadData and in class you call the method=readPropertyFile 
	    //Assert.assertEquals(CurrentURL, ReadData.readPropertyFile("CurrentUURL"));
		
		//Read the Hardcord from ExcelSheet 
	//	Assert.assertEquals(CurrentURL, ReadData.readExcelFile(2, 0));
	
	}
	
	@Test(enabled = true)
	public void verifyTitleTest() throws Exception
	{
		String Title = login.verifyTitle();
	  Assert.assertEquals(Title, "Swag Labs");
		//call the Title from class=ReadData and in class you call the method=readPropertyFile 
	//	Assert.assertEquals(Title,ReadData.readPropertyFile("Titles"));
		
		//Read the Hardcord from ExcelSheet 
	 //  Assert.assertEquals(Title, ReadData.readExcelFile(2, 1));
	
		
	}

	@Test(enabled = true/*,dependsOnMethods="verifyTitleTest"*/)
	public void verifyLoginlogoTest()
	{
		boolean Logo1 = login.verifyLoginlogo();
		Assert.assertEquals(Logo1, true);
	}
	
	@Test(enabled = false)
	public void verifybotcolumnlogoTest()
	{
		boolean Logo2 = login.verifybotcolumnlogo();
		Assert.assertEquals(Logo2, true);
	}
	
	@Test(enabled = false)
	public void verifylogincredentialsTest()
	{
		boolean Text1 = login.verifylogincredentials();
		Assert.assertEquals(Text1, true);
	}
	
	@Test(enabled = false)
	public void verifyloginpasswordTest()
	{
		boolean Text2 = login.verifyloginpassword();
		Assert.assertEquals(Text2, true);
	}
	
	@Test(enabled = false)
	public void verifyUsernameTextBoxTest()
	{
		boolean UsernameText = login.verifyUsernameTextBox();
		Assert.assertEquals(UsernameText, true);
	}
	
	@Test(enabled = false)
	public void verifyUsernameTextBoxAgTest()
	{
		boolean UsernameTe = login.verifyUsernameTextBoxAg();
		Assert.assertEquals(UsernameTe, false);
	}
	
	@Test(enabled = false)
	public void verifyPasswordTextBoxTest()
	{
		boolean Visiable = login.verifyPasswordTextBox();
		Assert.assertEquals(Visiable, true);
	}
	
	@Test(enabled = false/*,dependsOnMethods="verifyTitleTest"*/)
	public void verifyPasswordTextBoxAgTest()
	{
		boolean Selected1 = login.verifyPasswordTextBoxAg();
		Assert.assertEquals(Selected1, false);
	}
	
	@Test(enabled = true/*,dependsOnMethods="verifyTitleTest"*/)
	public void verifyloginbuttonButtonTest()
	{
		boolean Visiable2 = login.verifyloginbuttonButton();
		Assert.assertEquals(Visiable2, true);
	}
	
	@Test(enabled = true/*,dependsOnMethods="verifyTitleTest"*/)
	public void verifyloginbuttonButtonAgTest()
	{
		boolean Selected2 = login.verifyloginbuttonButtonAg();
		Assert.assertEquals(Selected2, false);
	}
	
	@Test(enabled=true/*,dependsOnMethods="verifyTitleTest"*/)
	public void LoginToPage1Test() throws Exception
	{
		String loginsucessfull = login.LoginToPage1();
		Assert.assertEquals(loginsucessfull, "PRODUCTS");
        //call the Title from class=ReadData and in class you call the method=readPropertyFile 
	    //Assert.assertEquals(loginsucessfull, ReadData.readPropertyFile("ProductsText"));
		
		//Read the Hardcord from ExcelSheet  
  //  	Assert.assertEquals(loginsucessfull, ReadData.readExcelFile(2, 3));
		
		
		
   
		
	}
	
	

	
	
	@AfterMethod
	public void CloseBrowser(ITestResult it) throws Exception
	{
		if(ITestResult.FAILURE == it.getStatus())
			Thread.sleep(10000);
		{
			ReadData.Screenshots(it.getName());
		}
		
		driver.close();
	}
}
