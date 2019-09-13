package guru99Demo.guru99Demo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pageobjects.userloginpage;


public class LoginTopNavTC2 extends base{
	

	@Test 
	public void userLogin() throws IOException
	{
		    driver = initializeDriver();
		    String URL = prop.getProperty("url");
		    driver.get(URL);
			/*driver.get("http://demo.guru99.com/v4/");*/
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	        
			userloginpage LP= new userloginpage(driver);
			System.out.println(LP.getNavSelenium().getText());
			System.out.println(LP.getNavInsuranceProj().getText());
			System.out.println(LP.getNavAgileProject().getText());
											
		
		   driver.close();
		   System.out.println("Test complete");
	
	}
	
	}

	


