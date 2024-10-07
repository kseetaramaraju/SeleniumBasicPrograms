package uploadfiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Using_Auto_IT_Tool
{
    public static void main(String[] args) throws IOException, InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://smallpdf.com/pdf-converter");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[text()='Choose Files']")).click();

        Thread.sleep(2000);
        // to use autoit
        Runtime.getRuntime().exec("C:\\Users\\seetharamaraju\\OneDrive\\Documents\\fileupload.exe");

//        "C:\Users\seetharamaraju\OneDrive\Desktop\autoitcustompage.exe"

    }

}
