package Popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	/*	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		the above implicit wait with give an exception 
		*/
		driver.get("https://www.flipkart.com/");	
		driver.findElement(By.xpath("(//button)[2]")).click();
	}
}
