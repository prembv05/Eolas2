package com.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_jacket 
{
	@FindBy(xpath="(//img[contains(@class,'s-image')])[47]")
	private WebElement jacketimg;
	
	public Amazon_jacket(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement image()
	{
		return jacketimg;
	}
	public void jacketimage()
	{
		jacketimg.click();
	}
}
