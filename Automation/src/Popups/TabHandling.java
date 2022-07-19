package Popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabHandling {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allTab = driver.getWindowHandles();
		int count=allTab.size();
		/*
		 * System.out.println(count); for(String Tab:allTab) { System.out.println(Tab);
		 * } driver.quit();
		 */

//to close all the tab without using quit() method. 
		for(String Tab:allTab) {
			driver.switchTo().window(Tab);
			driver.close();
		}
	}
}
