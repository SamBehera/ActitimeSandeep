package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.yaml.snakeyaml.events.Event.ID;

public class implicit_Wait {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS); 
//pageLoadTimeout is only for get() to hold execution for specified seconds.
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
/*implicitly wait
 * -- is always applied globally 
 * -- is available for all the webelements.
 */	
		driver.get("https://demo.actitime.com/login.do");
		WebElement s1 = driver.findElement(By.id("username"));
		s1.sendKeys("admin");	
		Thread.sleep(2000);
		
		WebElement s2 = driver.findElement(By.name("pwd"));
		s2.sendKeys("manager");
		Thread.sleep(2000);
/* 	Explicit wait		
		driver.findElement(By.xpath("//a/div")).click();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Logoutlink"))); 
			driver.findElement(By.id("LogoutLink")).click();
*/		
		driver.findElement(By.name("q"));
//customer wait
		driver.findElement(By.xpath("//a/div")).click();
		int i=0;
		while(i<100) {
			try {
				driver.findElement(By.id("LogoutLink")).click();
				break;
			}
			catch(NoSuchElementException e) {
				System.out.println("No found in "+ i+"attempt.");
				i++;
			}
		}
		
	}

}
