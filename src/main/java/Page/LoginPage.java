package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;

public class LoginPage extends TestBase {
	
 //Test case
	//TC1 = Verify Current URL
	//TC = Verify Title
	//TC2 = Verify loginlogo
	//TC3 = Verify botcolumnlogo
	//TC4 = Verify logincredentials
	//TC5 = Verify loginpassword
	//TC6 = Verify UsernameTextBox
	//TC7 = Verify PasswordTextBox
	//TC8 = Verify loginbuttonButton
	//TC9 = LoginToPage1
	//TC10=Verify ProductsTitle
	
	
	@FindBy(xpath ="//div[@class='login_logo']") private WebElement loginlogo;
	@FindBy(xpath ="//div[@class='bot_column']") private WebElement botcolumnlogo;
	@FindBy(xpath ="//div[@class='login_credentials']") private WebElement logincredentials;
	@FindBy(xpath ="//div[@class='login_password']") private WebElement loginpassword;
	@FindBy(xpath ="//input[@id='user-name']") private WebElement UsernameTextBox;
	@FindBy(xpath ="//input[@id='password']") private WebElement PasswordTextBox;
	@FindBy(xpath ="//input[@id='login-button']") private WebElement loginbuttonButton;
	@FindBy(xpath="//span[text()='Products']") private WebElement ProductsTitle;
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//TC1 = Verify Current URL
	public String verifyURL()
	{
		return driver.getCurrentUrl();
	}
 
	//TC = Verify Title
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	
	//TC2 = Verify loginlogo
	public boolean verifyLoginlogo()
	{
		return loginlogo.isDisplayed();	    	
	}
	
	//TC3 = Verify botcolumnlogo
	public boolean verifybotcolumnlogo()
	{
		return botcolumnlogo.isDisplayed();
	}
	
	//TC4 = Verify logincredentials
    public boolean verifylogincredentials()
    {
    	return logincredentials.isDisplayed();
    }
    
   //TC5 = Verify loginpassword
    public boolean verifyloginpassword()
    {
    	return loginpassword.isDisplayed();
    }
    
   //TC6 = Verify UsernameTextBox
    public boolean verifyUsernameTextBox()
    {
    	return UsernameTextBox.isDisplayed();
    }
    
    public boolean verifyUsernameTextBoxAg()
    {
    	return UsernameTextBox.isSelected();
    }
    
   //TC7 = Verify PasswordTextBox
    public boolean verifyPasswordTextBox()
    {
    	return PasswordTextBox.isDisplayed();
    }
    
    public boolean verifyPasswordTextBoxAg()
    {
    	return PasswordTextBox.isSelected();
    }

	//TC8 = Verify loginbuttonButton
    public boolean verifyloginbuttonButton()
    {
    	return loginbuttonButton.isDisplayed();
    }
    
    public boolean verifyloginbuttonButtonAg()
    {
    	return loginbuttonButton.isSelected();
    }
    
   //TC9 = LoginToPage1
    public String LoginToPage1() throws Exception
    {
    	
    
    	UsernameTextBox.sendKeys("standard_user");
       PasswordTextBox.sendKeys("secret_sauce");
    	
    	
        //Read the Hardcord from ExcelSheet  

    //	UsernameTextBox.sendKeys(ReadData.readExcelFile(1, 0));
   //   PasswordTextBox.sendKeys(ReadData.readExcelFile(1, 1));
   	
        
       
    	//Read data from other package-TestData  in this package create a class = Configure.property and i store all the informations
    	// like URL,username ,passwords,etc then i call the data by using class name and method name given below 
        //UsernameTextBox.sendKeys(ReadData.readPropertyFile("USERNAME"));
        //PasswordTextBox.sendKeys(ReadData.readPropertyFile("Password"));
    	loginbuttonButton.click();
    	return ProductsTitle.getText();
    	
    }
    
  //TC10=Verify ProductsTitle
    public boolean verifyProductsTitle()
    {
    	return ProductsTitle.isDisplayed();
    }
    
    
    
}
