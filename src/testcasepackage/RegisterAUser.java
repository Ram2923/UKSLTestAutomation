package testcasepackage;

import org.eclipse.jetty.servlet.ServletHolder.Registration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pompackage.HomePage;
import pompackage.RegisterationPage;

public class RegisterAUser 
{
	@Test
	public void registerUser () throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./BrowserChrome/chromedriver.exe");
		WebDriver driver  = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://newtours.demoaut.com");
		
		// CREATE AN OBJECT OF HOME PAGE IN ORDER TO CLICK REGISTER BUTTON
		HomePage homepage = new HomePage (driver);
		homepage.clickRegisterButton();
		
		// CREATE AN OBJECT OF REGISTRATION PAGE IN ORDER TO ENTER THE USER INFORMATION AND REGISTER
		RegisterationPage regpage = new RegisterationPage (driver);
		regpage.registerUser("RAMPRASAD", "CHIGARI", "9538429476", "USKL@TEST.COM", "RAJAJINAGAR", "BANGALORE", "560060", "PASSWORD", "PASSOWRD", "TEST");
		
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
