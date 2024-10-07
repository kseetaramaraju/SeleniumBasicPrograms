package day1;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;


public class Basic_WebDriver {

	public static void main(String[] args) throws InterruptedException {


		// launching browser
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com");

		Thread.sleep(3000);

		driver.manage().window().maximize();

		Thread.sleep(3000);

		String actual_title=driver.getTitle();
		//        Facebook – log in or sign up
		if (actual_title.equals("Facebook – log in or sign up"))
		{
			System.out.println("title is same !!");
		}
		else {
			System.out.println("title is not same !!");
		}

		Thread.sleep(3000);
		// closing the browser 

		driver.close();

	}

}
