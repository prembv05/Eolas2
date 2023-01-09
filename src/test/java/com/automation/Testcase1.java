package com.automation;


import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import com.pom.pages.Amazon_jacket;
import com.pom.pages.Amazon_login;
import com.pom.pages.jacket_allen;

import generic_library.Opening_closing;

public class Testcase1 extends Opening_closing  
{
	@Test
	public void tc1()
	{
		Amazon_login al = new Amazon_login(driver);
		al.searchtextbox();
		al.Searchclickbutton();
		
		Amazon_jacket aj = new Amazon_jacket(driver);
		Point loc = aj.image().getLocation();
		
		int x = loc.getX();
		int y = loc.getY();
		
	    we.Scrollbar(driver, x, y);
	    
	    aj.jacketimage();
	    
	    jacket_allen ja = new jacket_allen(driver);
	    we.SwitchTab(driver);
	    Point lo = ja.lsize().getLocation();
		
		int X = lo.getX();
		int Y = lo.getY();
		we.Scrollbar(driver, X, Y);
	    ja.Size();
	    ja.Buy();
	}
	
}

