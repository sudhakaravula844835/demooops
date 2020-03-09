package Testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	
	
  @Test
  public void add1And2() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1031\\Downloads\\Chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://paytm.com/");
  }
  @BeforeMethod
  public void beforeMethod() {
	 System.out.println("SimpleTest: @beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println(" SimpleTest :@afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("SimpleTest:@beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("SimpleTest:@beforeClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("SimpleTest:@beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("SimpleTest:@afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("SimpleTest:@beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("SimpleTest:@afterSuite");
  }

}
