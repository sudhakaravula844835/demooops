package Selenium;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class ActionTest {
WebDriver driver;

@BeforeAll
public static void setup() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1031\\Downloads\\chromedriver.exe");
}

@BeforeEach
public void initAll() {
driver = new ChromeDriver();
String baseUrl1= "https://www.paytm.com/";
driver.get(baseUrl1);
}


@Test
void test() {
Actions actions=new Actions(driver);
// driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
actions.moveToElement(driver.findElement(By.xpath("//input[@placeholder='Search for a Product , Brand or Category']"))).click().keyDown(Keys.SHIFT).sendKeys("crocs");
driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
}

}