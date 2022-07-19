package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class indeedChildParentpopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://secure.indeed.com/");
		String mTitle = driver.getTitle();
		driver.findElement(By.id("login-google-button")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("apple-signin-button")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("login-facebook-button")).click();
		Thread.sleep(7000);		

		Set<String> allwh = driver.getWindowHandles();
		for(String wh:allwh) {
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			System.out.println(title);
			if(!(mTitle.equals(wh))) 
				driver.close();
			Thread.sleep(4000);
		}
	}
}