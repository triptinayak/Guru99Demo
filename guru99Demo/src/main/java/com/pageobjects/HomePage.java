package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public WebDriver driver;
	By text = By.xpath("//h2[text()='Guru99 Bank']");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getText()
	{
		return driver.findElement(text);
	}

}
