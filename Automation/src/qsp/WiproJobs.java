package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WiproJobs {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Wipro jobs");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='wipro jobs'])[1]")).click();
		Thread.sleep(2000);
		List<WebElement> link = driver.findElements(By.tagName("a"));
		for(WebElement AllLinks:link) {
			System.out.println(AllLinks.getAttribute("href"));
		}
		driver.close();
	}
}
