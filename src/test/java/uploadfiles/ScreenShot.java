package uploadfiles;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;

public class ScreenShot
{


    WebDriver driver=new EdgeDriver();
    @BeforeMethod
    void setup() throws InterruptedException {
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @Test
    void all_getMethods() throws InterruptedException {


        TakesScreenshot screenshot=(TakesScreenshot) driver;

        //1 fullscreen
//        File sourcefile=screenshot.getScreenshotAs(OutputType.FILE);
//        File fullscreen=new File("C:\\Users\\seetharamaraju\\OneDrive\\Desktop\\All_Automition_Concepts\\Selenium_Web_Driver\\screenshots"+"\\fullscreen.png");
//        sourcefile.renameTo(fullscreen);
//

        //2 specific screen

//        WebElement element=driver.findElement(By.xpath("//div[@class='column-center-inner']"));
//
//        File ss=element.getScreenshotAs(OutputType.FILE);
//        File t=new File("C:\\Users\\seetharamaraju\\OneDrive\\Desktop\\All_Automition_Concepts\\Selenium_Web_Driver\\screenshots"+"\\specificimage.png");
//        ss.renameTo(t);

        // 3 element screenshoot it is same as above one

        WebElement element=driver.findElement(By.xpath("//img[@class='wikipedia-icon']"));

        File ss=element.getScreenshotAs(OutputType.FILE);
        File t=new File("C:\\Users\\seetharamaraju\\OneDrive\\Desktop\\All_Automition_Concepts\\Selenium_Web_Driver\\screenshots"+"\\elementscreenshot.png");
        ss.renameTo(t);

    }



}
