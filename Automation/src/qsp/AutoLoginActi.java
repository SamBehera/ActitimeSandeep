package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AutoLoginActi {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.actitime.com/login.do");
		
		WebElement s1 = driver.findElement(By.id("username"));
		s1.sendKeys("admin");	
		Thread.sleep(2000);
		
		WebElement s2 = driver.findElement(By.name("pwd"));
		s2.sendKeys("manager");
		Thread.sleep(2000);
		
		WebElement button = driver.findElement(By.xpath("//a/div"));
		button.click();
		Thread.sleep(6000);

		WebElement lo = driver.findElement(By.id("logoutLink"));
		lo.click();
		driver.close();
	}
}
