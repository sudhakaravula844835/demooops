package Paytm;

import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaytmTest {
	WebDriver driver;

	@BeforeAll
	public static void setup() {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1031\\Downloads\\chromedriver.exe");
	// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	@BeforeEach
	public void waitTest() {
		String baseUrl="https://paytm.com/";
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@Test
	public void test(){
	WebElement footerdriver=driver.findElement(By.id("app._2LhZ"));
	WebElement coloumndriver=footerdriver.findElement(By.xpath("//*[@id=\"app\"]/div/div[5]/div[3]/div[1]/a[1]"));
	
	System.out.println(coloumndriver.findElement(By.tagName("a")).getSize());
	String clickonlinkTab =Keys.chord(Keys.CONTROL,Keys.ENTER);
	coloumndriver.findElements(By.tagName("a")).get(0).sendKeys(clickonlinkTab);
//	coloumndriver.findElements(By.tagName("a")).get(1).sendkeys(clickonlinkTab);
	
	
	Set<String>id=driver.getWindowHandles();
	Iterator<String> it=id.iterator();
	String parentId=it.next();
	String childId=it.next();
	driver.switchTo().window(childId);
	
	
	System.out.println(driver.getTitle());
	}
}
	
