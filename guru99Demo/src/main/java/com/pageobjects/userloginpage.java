package com.pageobjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class userloginpage{

	public WebDriver driver;
	//driver= initializeDriver(driver);
	By UserID= By.xpath("//input[@name='uid']");
	By Password=By.xpath("//input[@name='password']");
	By Loginbtn= By.xpath("//input[@name='btnLogin']");
	
	By NavSelenium = By.xpath("//div/nav/div/div/ul/li[1]");
	
	By NavInsuranceProj = By.xpath("//a[text()='Insurance Project']");
	
	By NavAgileProject = By.xpath("//a[contains(text(),'Agile Project')]");

	//constructor for driver object that doesn't return anything
	public userloginpage(WebDriver driver) {
				this.driver=driver;
			}
	
	public WebElement getUserID()
	{
		return driver.findElement(UserID);
	}
	
	public WebElement getPassowrd()
	{
		return driver.findElement(Password);
	}
	public WebElement getLoginbtn()
	{
		return driver.findElement(Loginbtn);
	}
	public WebElement getNavSelenium()
	{
		return driver.findElement(NavSelenium);
	}
	public WebElement getNavInsuranceProj()
	{
		return driver.findElement(NavInsuranceProj);
	}
	public WebElement getNavAgileProject()
	{
		return driver.findElement(NavAgileProject);
	}
}
