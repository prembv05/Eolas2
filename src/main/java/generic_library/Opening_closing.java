package generic_library;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Opening_closing 
{
	public Property_file pf = new Property_file();
	public WebElements we = new WebElements();
	
	
	public WebDriver driver;
	@BeforeMethod
	public void openapp() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pf.getpropertyfile("url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void closeapp(ITestResult res) throws IOException
	{
		int status= res.getStatus();
		String name = res.getName();
		
		if(status == 2)
		{
			Photopath pp = new Photopath();
			pp.photopath(driver, name);
		}
		driver.quit();
	}
}
