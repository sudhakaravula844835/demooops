package Com.Baseclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WrapperClass {
	protected WebDriver driver;
    public void launchApplication(String browser,String url){
        try{
            if(browser.equalsIgnoreCase("firefox")){
                driver=new FirefoxDriver();
            }
            else if(browser.equalsIgnoreCase("Chrome")){
                System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1031\\Downloads\\chromedriver.exe");
                driver=new ChromeDriver();
                driver.get(url);
            }
        }
        catch(WebDriverException e){
            System.out.println("browser cannot be launched");
        }

    }
    public void screenshot(String path) throws IOException {
        TakesScreenshot ts=(TakesScreenshot)driver;
        File source=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source,new File(path));
    }
    public void quit(){
        driver.close();
    }


}