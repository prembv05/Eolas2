package generic_library;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Photopath
{
	public void photopath(WebDriver driver,String name) throws IOException
	{
		Date dt = new Date();
		String currentdate = dt.toString().replaceAll(";", "-");
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File ss = ts.getScreenshotAs(OutputType.FILE);
		
		File ds = new File(Auto_constant.photopath+currentdate+name+".png");
		
		FileUtils.copyFile(ss,ds);
	}
}
