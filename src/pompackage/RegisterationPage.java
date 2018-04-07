package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterationPage 
{
	// Declare the Web Elements of Registration Page
	@FindBy (xpath = "//input[@name='firstName']")   
	private WebElement FirstNameField;
	
	@FindBy (xpath = "//input[@name='lastName']")
	private WebElement LastNameField;
	
	@FindBy (xpath = "//input[@name='phone']")
	private WebElement PhoneField;
	
	@FindBy (xpath = "//input[@name='userName']")
	private WebElement UserNameField;
	
	@FindBy (xpath = "//input[@name='address1']")
	private WebElement AddressField;
	
	@FindBy (xpath = "//input[@name='city']")
	private WebElement CityField;
	
	@FindBy (xpath = "//input[@name='postalCode']")
	private WebElement PostCodeFiled;
	
	@FindBy (xpath = "//input[@name='password']")
	private WebElement PasswordField;
	
	@FindBy (xpath = "//input[@name='confirmPassword']")
	private WebElement ConfirmPasswordField;
	
	@FindBy (xpath = "//input[@name='register']")
	private WebElement SubmitButton;
	
// Initialize  the Web Elements
		public RegisterationPage(WebDriver driver) 
		
		{
			PageFactory.initElements(driver, this);
		}
		
// Develop Methods to perform actions on Browser
   public void registerUser (String fname, String lname, String phone, String username, String address, String city, String postcode, String username1, 
		   String password, String conformpass) 
   {
	   FirstNameField.sendKeys(fname);
	   FirstNameField.sendKeys(lname);
	   PhoneField.sendKeys(phone);
	   UserNameField.sendKeys(username);
	   AddressField.sendKeys(address);
	   CityField.sendKeys(city);
	   PostCodeFiled.sendKeys(postcode);
	   UserNameField.sendKeys(username1);
	   PasswordField.sendKeys(password);
	   ConfirmPasswordField.sendKeys(conformpass);
	   SubmitButton.click();
	   
	   
	   
	   
	   
	   
   }
   
  	

		
	
	
}
