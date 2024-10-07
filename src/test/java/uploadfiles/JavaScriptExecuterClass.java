package uploadfiles;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class JavaScriptExecuterClass {

    WebDriver driver=new EdgeDriver();
    @BeforeMethod
    void setup() throws InterruptedException {
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @Test
    void all_getMethods() throws InterruptedException {

        WebElement element=driver.findElement(By.xpath("//input[@id='name']"));
        WebElement ele=driver.findElement(By.xpath("//input[@id='male']"));
        WebElement datepicker=driver.findElement(By.xpath("//input[@id='datepicker']"));



        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','john')",element);

        js.executeScript("arguments[0].click();",ele);

        Thread.sleep(2000);

        // scroll complete down
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)","");


        Thread.sleep(2000);
        //scroll complete up
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)","");


        // scroll till any specific element is visible


        Thread.sleep(2000);
        js.executeScript("arguments[0].scrollIntoView();",datepicker);


    }


}
