package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificBrowser {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://secure.indeed.com/");
		Thread.sleep(5000);
		driver.findElement(By.id("apple-signin-button")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("login-facebook-button")).click();
		Thread.sleep(7000);		

		Set<String> allwh = driver.getWindowHandles();
		for(String wh:allwh) {
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			if(title.equals("Facebook")) {
				driver.close();
			}
		}
	}
}
