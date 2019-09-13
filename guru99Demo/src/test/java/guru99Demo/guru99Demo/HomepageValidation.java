package guru99Demo.guru99Demo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pageobjects.HomePage;
import com.pageobjects.userloginpage;

public class HomepageValidation extends base {

	@BeforeTest
	public void startup() throws IOException {
		driver = initializeDriver();
	}

	@Test
	public void userLogin() throws IOException, InterruptedException {

		 String URL = prop.getProperty("url");
		  driver.get(URL); 
		  driver.manage().window().maximize(); driver.manage().deleteAllCookies();
		  driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  
		userloginpage LP = new userloginpage(driver);
		LP.getUserID().sendKeys("mngr222801");
		LP.getPassowrd().sendKeys("gAtejAt");
		LP.getLoginbtn().click();
		System.out.println("login successful");
		
				 
		HomePage hp = new HomePage(driver);
		System.out.println(hp.getText().getText());
	}

	@AfterTest
	public void teardown() {

		driver.close();
		System.out.println("Test complete");

	}

	/*
	 * @DataProvider public Object[][] getData() {
	 * 
	 * Object[][] data = new Object[1][1]; data[0][0] = "mngr222801"; data[0][1] =
	 * "gAtejAt";
	 * 
	 * 
	 * data[1][0] = "tripti"; data[1][1] = "1234";
	 * 
	 * return data; }
	 */

}
