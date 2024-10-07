package uploadfiles;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class WebDriverMethods
{

WebDriver driver=new EdgeDriver();
    @BeforeMethod
    void setup() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);

    }

    @Test
    void all_getMethods() throws InterruptedException {

//     String title=driver.getTitle();
//     System.out.println(title);
//
//        System.out.println("------------------------------------");
//
//        String currentUrl=driver.getCurrentUrl();
//        System.out.println(currentUrl);
//
//        System.out.println("------------------------------------------");


//        String pageSource=driver.getPageSource();
//        System.out.println(pageSource);

//        System.out.println("------------------------------------------");
//
//        String windowHandle=driver.getWindowHandle();
//        System.out.println(windowHandle);
//
//        System.out.println("------------------------------------------");


       WebElement element =driver.findElement(By.linkText("OrangeHRM, Inc"));

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",element);

        Thread.sleep(3000);
        driver.quit();

       Set<String> windowHandles=driver.getWindowHandles();
       System.out.println(windowHandles);




    }

}
