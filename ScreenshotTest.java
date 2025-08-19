package testdocs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class ScreenshotTest {
WebDriver driver;
@BeforeMethod
	public void setUp() {
    	ChromeOptions option=new ChromeOptions();
    	option.addArguments("--disable-extensions");
    	option.addArguments("--disable-popup-blocking");
    	option.addArguments("--disable-notifications");
    	option.setPageLoadStrategy(PageLoadStrategy.EAGER);
    	driver=new ChromeDriver(option);    	
    }
	    
    @Test
    public void takescreenshot() throws IOException{
        driver.get("https://www.w3schools.com/html/html_forms.asp");
        WebElement elm=driver.findElements(By.cssSelector("input[type='text']")).get(6);
        File file=elm.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("Output_Image/webelement_image.png"));
       
        try{
        	Thread.sleep(5000);
        }catch(Exception e){
        	System.out.println(e);
        }
        
    }
    
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}