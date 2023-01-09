 package generic_library;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebElements 
{
	public void DropDown(WebElement ele , String txt)
	{
		 Select s = new Select(ele);
		 s.selectByVisibleText(txt);
		 
	}
	public void switchtoFrame(WebDriver driver)
	{
		driver.switchTo().frame(0);
	}
	public void switchbacktoframe(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	public void Scrollbar(WebDriver driver,int x,int y)
	{
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	public void Mousehover(WebDriver driver,WebElement ele)
	{
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	public void Rightclick(WebDriver driver,WebElement ele)
	{
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
	}
	
	public void Doubleclick(WebDriver driver,WebElement ele)
	{
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	public void DragandDrop(WebDriver driver,WebElement src,WebElement dest)
	{
		Actions a = new Actions(driver);
		a.dragAndDrop(src, dest).perform();
	}
	
	public void Alertpopup(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public void SwitchTab(WebDriver driver)
	{
		  Set<String> child = driver.getWindowHandles();
		  
		  for(String a:child)
		  {
			  driver.switchTo().window(a);
		  }
	}
}
