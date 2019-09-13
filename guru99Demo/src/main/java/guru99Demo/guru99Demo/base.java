package guru99Demo.guru99Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {

	//create driver object
	public WebDriver driver;
	public Properties prop;
	//create method to invoke Driver
	public WebDriver initializeDriver() throws IOException
	{
		//property class is initialized for Data driven from property file
		prop=new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\tript\\eclipse-workspace\\guru99Demo\\src\\main\\java\\resources\\data.properties");
	    prop.load(fis);
	    
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\tript\\Drivers\\Chrome\\chromedriver.exe");
		     
			driver=new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{

			System.setProperty("webdriver.gecko.driver", "C:\\Users\\tript\\Drivers\\geckodriver.exe");
		       driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}
	
	

}
