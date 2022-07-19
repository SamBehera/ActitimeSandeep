package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTripFlightTime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//p[text()='Bangalore, IN - Kempegowda International Airport (BLR)']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Goa");
		driver.findElement(By.xpath("//p[text()='Goa, IN - Dabolim Airport (GOI)']")).click();
		driver.findElement(By.xpath("(//div[text()='13'])[1])")).click();
	}

}
