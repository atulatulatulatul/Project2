package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;
import Utility.ReadData;

public class InventoryPage extends TestBase {
	
	//TEST CASES
	//TC1 = Verify CurrentUrl
	//TC2 - Verify applogo
	//TC3 = Verify peekLogo
	//TC4 = Verify productsortcontainer
	//TC5 = Verify shoppingcartlink
	//TC6 = Add 6 Prodrct
	//TC7 = Remove 4 Product
	//TC8 = Verify footerrobotlogo
	
	@FindBy(xpath="//div[@class='app_logo']") private WebElement applogo;
	@FindBy(xpath ="//div[@class='peek']") private WebElement peekLogo;
	@FindBy(xpath="//select[@class='product_sort_container']") private WebElement productsortcontainer;
	@FindBy(xpath="//a[@class='shopping_cart_link']") private WebElement shoppingcartlink;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement backpack;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']") private WebElement Bikelight;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']") private WebElement BoltTshirt;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']") private WebElement  Jacket;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']") private WebElement Onesie;
	@FindBy(xpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']") private WebElement RedTshirt; 
	@FindBy(xpath="//img[@class='footer_robot']") private WebElement footerrobotlogo;
	@FindBy(xpath="//span[text()='Your Cart']") private WebElement YourCart;
	
	public InventoryPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//TC1 = Verify CurrentUrl
	public String verifyPage2URL()
	{
		return driver.getCurrentUrl();
	}
	
	public boolean verifyapplogo()
	{
		return applogo.isDisplayed();
	}
	
	public boolean verifypeekLogo()
	{
		return peekLogo.isDisplayed();
	}
	
	public boolean verifyproductsortcontainer()
	{
		return productsortcontainer.isDisplayed();
	}
	
	public boolean verifyshoppingcartlink()
	{
		return shoppingcartlink.isDisplayed();
	}
	
	public String add6Product() throws Exception 
	{
		Select s = new Select(productsortcontainer);
		s.selectByVisibleText("Price (low to high)");
	// call the Price (low to high) from class=ReadData and in class you call the method=readPropertyFile 

	//	s.selectByVisibleText(ReadData.readPropertyFile("Pricesuggestion"));
		
		backpack.click();
		Bikelight.click();
		BoltTshirt.click();
		Jacket.click();
		Onesie.click();
		RedTshirt.click();
		 String count = shoppingcartlink.getText();
		 return count;			
	}
	
	public String Remove3Product()
	{
		backpack.click();
		Bikelight.click();
		Onesie.click();
		String RemainItem = shoppingcartlink.getText();
		return RemainItem;
		
	}
	
	public boolean moveTothirdPage()
	{
		 shoppingcartlink.click();
		return YourCart.isDisplayed();
		 		 
	}

}
