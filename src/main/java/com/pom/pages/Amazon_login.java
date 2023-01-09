package com.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_login 
{
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchtb;
	
	@FindBy(xpath="(//input[contains(@id,'search')])[2]")
	private WebElement searchcb;
	
	public Amazon_login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void searchtextbox()
	{
		searchtb.sendKeys("jackets for men");
	}
	
	public void Searchclickbutton()
	{
		searchcb.click();
	}
	
}
