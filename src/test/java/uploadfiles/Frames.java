package uploadfiles;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Frames {


    WebDriver driver=new EdgeDriver();
    @BeforeMethod
    void setup() throws InterruptedException {
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @Test
    void frame() throws InterruptedException {

        WebElement frame=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));

        driver.switchTo().frame(frame);

        WebElement inputbox=driver.findElement(By.xpath("//input[@name='mytext1']"));
        Thread.sleep(2000);

        inputbox.sendKeys("SeetaRamaRaju");

    }

}
