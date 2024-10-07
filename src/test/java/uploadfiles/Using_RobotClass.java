package uploadfiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Using_RobotClass {

    public static void main(String[] args) throws AWTException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://smallpdf.com/pdf-converter");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//span[text()='Choose Files']")).click();

        // first way using robot class
        Robot robot = new Robot();
        robot.delay(3000);

        StringSelection ss = new StringSelection("C:\\Users\\seetharamaraju\\Downloads\\Selenium Notes (1).pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);

        robot.delay(2000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.delay(2000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);




    }


}
