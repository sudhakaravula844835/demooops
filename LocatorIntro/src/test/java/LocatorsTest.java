package seleid;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;



public class LocatorsTest {

WebDriver driver;

@BeforeAll
public static void InitValue()
{
System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver.exe");
}


@Test
public void testSomething() {


driver = new ChromeDriver();
String baseUrl = "file:///F:/PlayWithCSS/play-with-css/sample-page.html";
driver.get(baseUrl);

String actualTitle = driver.getTitle();

assertEquals("index", actualTitle);

// String tagName = driver.findElement(By.id("my-Address")).getText();
// System.out.println(tagName);
//
// assertEquals("I live in Duckburg", tagName);
//

}

@AfterEach
public void closeTest()
{
driver.close();
}
}