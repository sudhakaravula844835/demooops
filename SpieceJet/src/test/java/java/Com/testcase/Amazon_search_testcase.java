package java.Com.testcase;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Com.Baseclass.WrapperClass;
import Com.pages.Amazon_login_page;
import Com.pages.Amazon_search_page;

public class Amazon_search_testcase extends WrapperClass {
	//launching chrome browser
	@BeforeClass
	public void startup() 
	{
		launchApplication("chrome","https://www.amazon.in/");	
	}
	@Test
	public void move() throws InterruptedException {
		java.Com.pages.Amazon_search_page spage=new java.Com.pages.Amazon_search_page(driver);
		spage.movedown("mobiles");
	}
	@AfterClass
	public void close() throws IOException
	{   screenshot("C:\\Users\\BLTuser.BLT1031\\Desktop\\project\\TestFramework\\src\\test\\resources\\Screenshot\\login.png");
		quit();
	}
	
}
