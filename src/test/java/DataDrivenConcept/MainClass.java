package DataDrivenConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.time.Duration;

public class MainClass {

    public static void main(String[] args) throws IOException, InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // read the data from excel
        String filename= System.getProperty("user.dir")+"\\testdata\\fixed_deposit_data.xlsx";
        String sheetname="Sheet1";
        int rows=UtilityClass.getRowCount(filename,sheetname);


        for (int i=1;i<=rows;i++)
        {
            // pass excel data to webpage
            int priciple=(int)Double.parseDouble(UtilityClass.getCellData(filename,sheetname,i,0));
            int rateofintrest=(int)Double.parseDouble(UtilityClass.getCellData(filename,sheetname,i,1));
            int periodtime=(int)Double.parseDouble(UtilityClass.getCellData(filename,sheetname,i,2));
            String periodtype=UtilityClass.getCellData(filename,sheetname,i,3);
            String frequency=UtilityClass.getCellData(filename,sheetname,i,4);
            String maturityvalue=UtilityClass.getCellData(filename,sheetname,i,5);
            String expected=UtilityClass.getCellData(filename,sheetname,i,6);

            System.out.println(priciple);
            System.out.println(rateofintrest);
            System.out.println(periodtime);


            // locate web element
            driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(String.valueOf(priciple));
            driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(String.valueOf(rateofintrest));
            driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(String.valueOf(periodtime));

            Select select=new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
            select.selectByVisibleText(periodtype);

            Select select1=new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
            select1.selectByVisibleText(frequency);

            Thread.sleep(2000);

            driver.findElement(By.xpath("//div[@class='CTR PT15']//a[1]")).click();

            Thread.sleep(2000);

            WebElement element =driver.findElement(By.xpath("//span[@id='resp_matval' and @name='resp_matval']//strong"));
            String result=element.getText();

            //validation
            if(Double.parseDouble(maturityvalue)==Double.parseDouble(result))
            {
                System.out.println("Test Passed");
                UtilityClass.setCellData(filename,sheetname,i,7,"Passed");
                UtilityClass.fillGreenColor(filename,sheetname,i,7);
            }
            else {
                System.out.println("Test Failed");
                UtilityClass.setCellData(filename,sheetname,i,7,"failed");
                UtilityClass.fillRedColor(filename,sheetname,i,7);
            }

            Thread.sleep(3000);
            // clear
            driver.findElement(By.xpath("//img[@class='PL5']")).click();
        }
      driver.quit();

    }
}
