package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.zoho.com/crm/free-crm.html?zredirect=f");

		Thread.sleep(3000);

		driver.manage().window().maximize();

		Thread.sleep(3000);

		//id
		//		driver.findElement(By.id("namefield")).sendKeys("KseetaRamaRaju");

		//name
		driver.findElement(By.name("namefield")).sendKeys("KseetaRamaRaju");



	}

}
