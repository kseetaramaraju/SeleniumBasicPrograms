package uploadfiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClass
{

    WebDriver driver;
    @Test
    void testMoveToElement() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/div[2]/div"));
        Actions act=new Actions(driver);
        act.moveToElement(element1).perform();
        WebElement element2 = driver.findElement(By.xpath("/html/body/div[4]/div/object/a[2]"));
        Thread.sleep(2000);
        act.moveToElement(element2).click().perform();
        driver.quit();

    }

    @Test
    void method2 () throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);


        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/div[2]/div"));
        Actions act = new Actions(driver);
        act.moveToElement(element1).perform();

        WebElement element2 = driver.findElement(By.xpath("/html/body/div[4]/div/object/a[2]"));
        Thread.sleep(2000);
        act.moveToElement(element2).click().perform();


        act.doubleClick(element1).perform();
        act.contextClick(element1).perform();

        driver.quit();
    }




}
