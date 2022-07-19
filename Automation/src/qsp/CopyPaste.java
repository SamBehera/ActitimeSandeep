package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class CopyPaste {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.opensourcebilling.org/");
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+ "ac");
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys(Keys.CONTROL + "av");
		Thread.sleep(2000);
		
	/*	WebElement m = driver.findElement(By.id("email"));
		m.sendKeys(Keys.CONTROL + "ac");
	*/	
		driver.close();
	}
}
