package guru99Demo.guru99Demo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pageobjects.userloginpage;

public class LoginTestCase extends base {

	
	  @BeforeTest 
	  public void startup() throws IOException { 
		  driver = initializeDriver(); 
		/*
		 * String URL = prop.getProperty("url"); driver.get(URL); //
		 * driver.get("http://demo.guru99.com/v4/");
		 * driver.manage().window().maximize(); driver.manage().deleteAllCookies();
		 * driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 */
	  }


	@Test(dataProvider = "getData")
	public void userLogin(String Username, String Password) throws IOException {
		
		  //driver = initializeDriver();
		  String URL = prop.getProperty("url");
		  driver.get(URL); 
		  //driver.get("http://demo.guru99.com/v4/");
		  driver.manage().window().maximize(); driver.manage().deleteAllCookies();
		  driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 

		userloginpage LP = new userloginpage(driver);
		LP.getUserID().sendKeys(Username);
		LP.getPassowrd().sendKeys(Password);
		LP.getLoginbtn().click();
		System.out.println("login successful");
		  }
		 
		  @AfterTest public void teardown() {
		 
		driver.close();
		System.out.println("Test complete");

	}

	@DataProvider
	public Object[][] getData() {
		// row stands for how many data type test should run
		// col stands for how ant values per each test
		Object[][] data = new Object[2][2];
		data[0][0] = "mngr222801";
		data[0][1] = "gAtejAt";

		data[1][0] = "tripti";
		data[1][1] = "1234";
		return data;
	}
}
