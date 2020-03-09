package RedTest;

import org.testng.annotations.Test;

import RedBusPages.BusHire;
import RedBusPages.SearchPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	 WebDriver driver;
	 BusHire bushire;
	 SearchPage Search;
	 
	 
	 
	 
	 @BeforeSuite
	  public void beforeSuite() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1031\\Downloads\\chromedriver.exe");
	  }
	
	
	 
	 

  @Test
  public void f() {
	  driver = new ChromeDriver();
	  driver.get("https://www.redbus.in/");
	  Search= new SearchPage(driver);
	  Search.SetBorading("chennai");
	  Search.SetDroping("Vijayawada");
	  bushire.SelectCity("Chennai");
	  bushire.SelectFromLoc("RailwayStation");
	  bushire.SelectDropping("Airport");
	  
  }
//  @BeforeMethod
//  public void beforeMethod() {
//  }

 
}
