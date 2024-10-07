package uploadfiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Using_SendKeys {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();


        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\seetharamaraju\\Downloads\\Selenium Notes (1).pdf");

      // using send keys
       // sendkeys() will work only in the case where the webelent is input and attribute is type=file only






    }


}
