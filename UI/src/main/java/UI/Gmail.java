package UI;

import java.util.Iterator;
import java.util.Set;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Gmail {

WebDriver driver;

@BeforeAll
public static void setup() {
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");

}

@BeforeEach
public void initEach() {
driver = new ChromeDriver();

driver.get("https://www.spicejet.com/default.aspx");
}

@Test
public void test() {

	WebElement footerdriver=driver.findElement(By.id("app._2LhZ"));
	WebElement coloumndriver=footerdriver.findElement(By.xpath("//*[@id=\"app\"]/div/div[5]/div[3]/div[1]/a[1]"));
	
	System.out.println(coloumndriver.findElement(By.tagName("a")).getSize());
	String clickonlinkTab =Keys.chord(Keys.CONTROL,Keys.ENTER);
	coloumndriver.findElements(By.tagName("a")).get(0).sendKeys(clickonlinkTab);
	
	
	Set<String>id=driver.getWindowHandles();
	Iterator<String> it=id.iterator();
	String parentId=it.next();
	String childId=it.next();
	driver.switchTo().window(childId);
	
	
	System.out.println(driver.getTitle());
}
}