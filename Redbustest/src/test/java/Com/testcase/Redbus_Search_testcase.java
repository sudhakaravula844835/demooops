package Com.testcase;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Com.Baseclass.WrapperClass;
import Com.pages.Redbus_Search_page;

public class Redbus_Search_testcase extends WrapperClass {
    @BeforeClass
    public void startup(){
        launchApplication("Chrome","https://www.redbus.in");
    }
    @Test
    public void buses() throws InterruptedException{
    	Redbus_Search_page spage=new Redbus_Search_page(driver);
        spage.from("Chennai");
        spage.to("Tenali");
        spage.Onward();
        spage.date1();
        spage.Return();
        spage.date2();
        spage.search();
        Thread.sleep(3000);
    }
    @AfterClass
    public void close() throws IOException {
        screenshot("C:\\Users\\BLTuser.BLT1031\\Desktop\\buses.png");
        quit();
    }
}