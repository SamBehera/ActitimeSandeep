package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();

		WebElement day = driver.findElement(By.name("birthday_day"));
		Select d=new Select(day); 
		d.selectByIndex(16);

		WebElement month = driver.findElement(By.name("birthday_month"));
		Select m=new Select(month);
		m.selectByValue("8");

		WebElement year = driver.findElement(By.name("birthday_year"));
		Select y=new Select(year);
		y.selectByVisibleText("1993");

		Thread.sleep(6000);
		driver.close();
	}
}
