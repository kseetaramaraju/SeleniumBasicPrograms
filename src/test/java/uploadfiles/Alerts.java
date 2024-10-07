package uploadfiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alerts {


    WebDriver driver=new EdgeDriver();
    @BeforeMethod
    void setup() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @Test
    void alerts() throws InterruptedException {

        // normal alert
//        WebElement na=driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']"));
//        na.click();
//
//        Thread.sleep(2000);
//        driver.switchTo().alert().accept();


        // confirmation alert
//        WebElement na=driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']"));
//        na.click();
//
//        Thread.sleep(2000);
//      //  driver.switchTo().alert().accept();
//
//        driver.switchTo().alert().dismiss();

        WebElement na=driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']"));
        na.click();

        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Hii Seetaram romba nandri");

        driver.switchTo().alert().accept();

        Thread.sleep(2000);
        driver.close();


    }

}
