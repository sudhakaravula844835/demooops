package selenium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



class LocatorExample {

	WebDriver webDriver;
	@BeforeAll
    public static void InitAll()
    {
		System.out.println("INit Init all");
		System.setProperty("webdriver.chrome.driver", "C:/Users/BLTuser.BLT1031/Downloads/chromedriver.exe");
    }
	
	@BeforeEach
	public void Init()
	{
		 webDriver = new ChromeDriver();
		String baseUrl = "https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
		 webDriver.get(baseUrl);
		 
	}
	
	@Test
	public void testNameLocator() {
		String actualTitle = webDriver.getTitle();
		assertEquals("index", actualTitle);
//		fail("Not yet implemented");
	}
	
	@AfterEach
	public void CloseEach()
	{
		 webDriver.close();
	}

}
