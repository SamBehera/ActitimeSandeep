package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocators {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	public static void main(String[] args){
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Saumtitri%20Behera/Desktop/demo.html");
		WebElement e=driver.findElement(By.tagName("a"));
		e.click();
		driver.findElement(By.tagName("a")).click(); //tagName() locator
		driver.navigate().back();
		driver.findElement(By.id("d1")).click(); //id() locator
		driver.findElement(By.name("n1")).click(); //name() locator
		driver.findElement(By.className("c1")).click(); //className() locator
		}
} 
