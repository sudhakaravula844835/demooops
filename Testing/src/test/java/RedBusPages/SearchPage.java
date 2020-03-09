package RedBusPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SearchPage{
	@FindBy(xpath="//input[@id='src']")//From
private WebElement From;
	@FindBy(xpath="//input[@id='txtDestination']")//Tp
	private WebElement To;
@FindBy	(xpath="//input[@id='txtOnwardCalendar']")//start sel
private WebElement DateStart;
@FindBy	(xpath="//div[@class='clearfix rb-calendar-main']//li[@class='weekend']//span[contains(text(),'7')]")//startDate
private WebElement DateOfJou;
@FindBy(xpath="//input[@id='txtReturnCalendar']")//Return Sel
private WebElement Return;
@FindBy(xpath="//div[@class='clearfix rb-calendar-main']//div[@id='rb-calmiddle']//span[contains(text(),'11')]")//Return Date
private WebElement ReturnDate;
@FindBy(xpath="//button[@class='D120_search_btn searchBuses']")//submit
private WebElement Search;
public SearchPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void SetBorading(String Fromloc)
{
	From.sendKeys(Fromloc);
}
public void SetDroping(String Toloc)
{
	To.sendKeys(Toloc);
}
public void SetDate()
{
	DateStart.click();
}
public void setStart()
{
	DateOfJou.click();
}
public void setRetrun()
{
	Return.click();
}
public void setreturndate()
{
	ReturnDate.click();
}
public void Submit()
{
	Search.click();
}
}
