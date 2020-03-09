package RedBusPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusHire {
//  @Test
//  public void f() {
//  }
//  @BeforeMethod
//  public void beforeMethod() {
//  }
//
//  @BeforeSuite
//  public void beforeSuite() {
//  }
	@FindBy(xpath="//input[@placeholder='eg: Mumbai']")
	private WebElement City;
	@FindBy(xpath="//input[@placeholder='eg: Railway Station']")
	private WebElement From;
	@FindBy(xpath="//li[contains(text(),'Railway Kalyana Mandapam, Egmore, Chennai, Tamil N')]")
	private WebElement PlaceSele;
	@FindBy(xpath="//input[@placeholder='eg: Airport/Pune']")
	private WebElement PlaceDrop;
	@FindBy(xpath="//li[contains(text(),'Airport Terminal Link, Meenambakkam, Chennai, Tami')]")
	private WebElement PlaceClick;
	@FindBy(xpath="//button[@id='hire_btn']")
	private WebElement To;
	
	
	private WebElement Find;
	
	public BusHire(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
public void SelectCity (String City1)
{
	City.sendKeys(City1);
}
public void SelectFromLoc(String PickUp)
{
	From.sendKeys(PickUp);
	
}
public void PlaceSelection()
{
	PlaceSele.click();
}
public void SelectDropping(String Drop)
{
	To.sendKeys(Drop);
}
public void SelectLocDrop()
{
	PlaceClick.click();
}
public void Next()
{
	Find.click();
}

}
