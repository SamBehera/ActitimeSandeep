package QUESTIONS;

import org.openqa.selenium.By;

/*Q. Write a script to print the price of 
 * HRX by Hritik Roshan t-shirt present in Myntra.com under men’s section.*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MouseAction {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		WebElement men = driver.findElement(By.xpath("(//div/a[@class='desktop-main'])[1]"));
		Actions mensection=new Actions(driver);
		mensection.moveToElement(men).perform();
		
		driver.findElement(By.xpath("(//ul[@class='desktop-navBlock']/li)[2]")).click();
		
		Thread.sleep(4000);
		driver.close();
	}

}
