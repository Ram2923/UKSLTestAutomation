package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	// Declare the Web Elements of Home Page
	@FindBy (xpath = "//a[text()='REGISTER']")
	private WebElement RegisterLink;
	
	// Initialize  the Web Elements
	public HomePage(WebDriver driver) 
	
	{
		PageFactory.initElements(driver, this);
	}
	
	// Develop Methods to perform actions on Browser
	
	public void clickRegisterButton () throws InterruptedException
	{
		RegisterLink.click();
		Thread.sleep(2000);
	}
	
	
	

}
