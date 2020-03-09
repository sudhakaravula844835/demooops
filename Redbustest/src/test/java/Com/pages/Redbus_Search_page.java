package Com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Redbus_Search_page {
    WebDriver driver;
    By From=By.xpath("//*[@id=\"src\"]");
    By TO=By.xpath("//*[@id=\"dest\"]");
     By Onward_date=By.xpath("//label[@class='db text-trans-uc']");
    By date1=By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[4]/td[6]");
    By Return_date=By.xpath("//*[@id=\"search\"]/div/div[4]/span");
    By date2=By.xpath("//*[@id=\"rb-calendar_return_cal\"]/table/tbody/tr[5]/td[4]");
    By search=By.xpath("//button[@id='search_btn']");
    public Redbus_Search_page(WebDriver driver){
        this.driver=driver;
    }
    public void from(String user){
        driver.findElement(From).sendKeys(user);
    }
    public void to(String userid){
        driver.findElement(TO).sendKeys(userid);
    }
    public void Onward(){
        driver.findElement(Onward_date).click();
    }
    public void date1(){
        driver.findElement(date1).click();
    }
    public void Return(){
        driver.findElement(Return_date).click();
    }
    public void date2(){
        driver.findElement(date2).click();
    }
    public void search(){
        driver.findElement(search).click();
    }
}