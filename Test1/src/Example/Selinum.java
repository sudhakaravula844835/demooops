package Example;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class Selinum {
WebDriver driver;


@BeforeSuite
 public void beforeSuite() {
 System.out.println("Before Suite");
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1031\\Downloads\\chromedriver.exe");

 
 }

  @Test
  public void Test() {
 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div[1]/div/div/div[2]/div[2]/ul/li[1]/div/div/input")).sendKeys("7981372253");
 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div[1]/div/div/div[2]/div[2]/ul/li[2]/div/div/input"));
 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div[1]/div/div/div[2]/div[2]/ul/li[3]/div[1]/div[1]/input")).sendKeys("559");
 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div[1]/div/div/div[3]/div[3]/button")).click();
 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 System.out.println("Test1");
 //driver.close();
 
  }
  @BeforeMethod
  public void beforeMethod() {
 System.out.println("BeforeMathod");
  }

  @AfterMethod
  public void afterMethod() {
 System.out.println("AfterMethod");
  }


//  @DataProvider
//  public Object[][] dp() {
//    return new Object[][] {
//      new Object[] { 1, "a" },
//      new Object[] { 2, "b" },
//    };
//  }
  @BeforeClass
  public void beforeClass() {
 System.out.println("Before class");
  }

  @AfterClass
  public void afterClass() {
 System.out.println("After Class");
  }

  @BeforeTest
  public void beforeTest() {
 System.out.println("Before Test");
 String bsurl="https://paytm.com/";
 driver=new ChromeDriver();
 driver.get(bsurl);
  }

  @AfterTest
  public void afterTest() {
 System.out.println("AfterTest");
 
 }


  @AfterSuite
  public void afterSuite() {
 
 driver.close();
 System.out.println("AfterSuite");
  }

}