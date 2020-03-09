package Testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest2 {
	
	
  @Test
  public void beTrue() {
	  System.out.println("complexTest");
  }
  @BeforeMethod
  public void beforeMethod() {
	 System.out.println("complexTest: @beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println(" complexTest :@afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("complexTest:@beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("complexTest:@beforeClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("complexTest:@beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("complexTest:@afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("complexTest:@beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("complexTest:@afterSuite");
  }

}
