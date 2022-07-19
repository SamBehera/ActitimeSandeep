package qsp;

/*
 * . Automate the following scenario.
I.	Open the browser
II.	Go to https://demo.actitime.com/login.do
III.	Log in to the actitime.
IV.	Click on Help drop down and click on About your actitime. 
V.	Click on read service agreement present on the popup
VI.	Capture all the dropdown heading and print on the Conlose.
VII.	Close all the tabs.
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildParentActi {
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
		
		driver.switchTo().frame(0)
	}
}
