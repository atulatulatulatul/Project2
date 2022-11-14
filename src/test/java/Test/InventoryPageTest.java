package Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Page.InventoryPage;
import Page.LoginPage;

public class InventoryPageTest extends TestBase {
	
	LoginPage login ;
	InventoryPage inventry ;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		inventry = new InventoryPage();
		login = new LoginPage();		
	}
	
	@Test(enabled = false)
	public void verifyPage2URLTest() throws Exception
	{
		login.LoginToPage1();
		 String secURL = inventry.verifyPage2URL();
		 Assert.assertEquals(secURL, "https://www.saucedemo.com/inventory.html");
	}

	@Test(enabled = false)
	public void verifyapplogoTest() throws Exception
	{
		login.LoginToPage1();
		 boolean Logo1 = inventry.verifyapplogo();
		 Assert.assertEquals(Logo1, true);
	}
	
	@Test
	public void add6ProductTest() throws Exception
	{
		login.LoginToPage1();
		String totalcollection = inventry.add6Product();
		Assert.assertEquals(totalcollection, "6");
	}
	
	@Test(enabled = false)
	public void Remove3ProductTest() throws Exception
	{
		login.LoginToPage1();
		 String totalIteam = inventry.Remove3Product();
		 Assert.assertEquals(totalIteam, "3");
		 
		
	}
	
	@Test(enabled = false) 
	public void verifymoveTothirdPageTest() throws Exception
	{
		login.LoginToPage1();
		boolean Thirdpagelogo = inventry.moveTothirdPage();
		Assert.assertEquals(Thirdpagelogo, true);
		
	}
	
	@AfterMethod
	public void CloseBrowser()
	{
		driver.close();
	}

}
