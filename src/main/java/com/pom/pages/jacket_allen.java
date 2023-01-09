package com.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class jacket_allen 
{
	@FindBy(name="2")
	private WebElement size;
	
	@FindBy(id="buy-now-button")
	private WebElement buy;
	
	public jacket_allen(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement lsize()
	{
		return size;
	}
	
	public void Size()
	{
		size.click();
	}
	
	public void Buy()
	{
		buy.click();
	}
}
