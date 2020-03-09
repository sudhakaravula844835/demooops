package Selenium;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GreenKart {

WebDriver driver;

@BeforeAll
public static void setup() {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1031\\Downloads\\chromedriver.exe");
// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

}

@Test
public void waitTest() {
driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

WebDriverWait wait=new WebDriverWait(driver,10);

int j = 0;
System.out.println("hereee11");
List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
// System.out.println("hereee");

for (int i = 0; i < products.size(); i++) {
String[] itemsNeeded = { "Cucumber", "Brocolli", "Tomato" };
// System.out.println("hereee1122234");
String[] name = products.get(i).getText().split("-");
// System.out.println("here333333333ee");
String formattedName = name[0].trim();
// System.out.println("hereee6666666666666" + formattedName);
List<String> itemsNeededList = Arrays.asList(itemsNeeded);
// System.out.println("hereee999999999" + itemsNeededList.size());
if (itemsNeededList.contains(formattedName)) {

j++;
System.out.println("INside COmparison" + formattedName);
driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
// System.out.println("heree654444444464e");
if (j == itemsNeeded.length) {
break;
}
}
}
driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
driver.findElement(By.cssSelector("#root > div > div > div > div:nth-child(4) > div > input"))
.sendKeys("rahulshettyacademy");

driver.findElement(By.cssSelector("button.promoBtn")).click();                                                            

}

}
