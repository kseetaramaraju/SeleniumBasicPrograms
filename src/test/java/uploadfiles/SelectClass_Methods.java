package uploadfiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class SelectClass_Methods
{

    public static void main(String[] args) throws InterruptedException {

//        WebDriver driver = new ChromeDriver();
//
//        driver.get("file:///C:/Users/seetharamaraju/Downloads/basicSelenium/basicSelenium/src/test/java/index.html");
//        driver.manage().window().maximize();
//
//       WebElement element = driver.findElement(By.id("fruits"));
//       element.click();
//
//        Select select=new Select(element);
//
//        select.selectByVisibleText("Apple");
//        Thread.sleep(2000);
//
//        select.selectByIndex(1);
//        Thread.sleep(2000);
//
//        select.selectByValue("orange");
//        Thread.sleep(2000);
//
//        select.selectByValue("grape");
//        Thread.sleep(2000);
//
//
//        WebElement firstSelected = select.getFirstSelectedOption();
//        System.out.println("First selected option: " + firstSelected.getText());


//        List<WebElement> elements =select.getAllSelectedOptions();
//
//        for (WebElement ee:elements)
//        {
//            System.out.println(ee.getText());
//        }


        // for bootstrap dropdown
        WebDriver driver = new ChromeDriver();

        driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));


        driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();

        driver.findElement(By.xpath("//input[@value='Java']")).click();
        driver.findElement(By.xpath("//input[@value='Python']")).click();





    }




}
