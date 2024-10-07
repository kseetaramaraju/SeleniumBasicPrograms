package uploadfiles;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class WaitMethods
{

    WebDriver driver=new EdgeDriver();
    @BeforeMethod
    void setup() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @Test
    void WaitMethods() throws InterruptedException {

        // implicit wait()
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//
//        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
//        Thread.sleep(2000);
//        driver.switchTo().alert().accept();

        // explicitwait()

//        WebDriverWait webDriverWait=new WebDriverWait(driver,Duration.ofSeconds(10));
//        WebElement element=webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Click for JS Alert']")));
//
//        element.click();
//        Thread.sleep(2000);
//        driver.switchTo().alert().accept();

        // fluent wait()

        Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(10))
                .ignoring(NoSuchElementException.class);

        WebElement element=wait.until( driver ->  driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")) );


        element.click();
        Thread.sleep(2000);

        driver.switchTo().alert().accept();




    }

}
