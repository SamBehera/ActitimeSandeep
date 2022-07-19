package FrameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleFrameHandling {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Saumtitri%20Behera/OneDrive/QSpider/selenium/Page1.html");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("JSP");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("QSP");

		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("B");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("A");
		
		WebElement we=driver.findElement(By.xpath("//iframe"));
		driver.findElement(By.id("t1")).sendKeys("C");
		
		driver.switchTo().frame(we);
		driver.findElement(By.id("t2")).sendKeys("D");
		}
}
