package EnabledDisabled;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessDisabledElement {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Saumtitri%20Behera/OneDrive/QSpider/selenium/UnPasword.html");
		driver.findElement(By.id("d1")).sendKeys("admin");
//		driver.findElement(By.id("d2")).sendKeys("manager"); It gives error. 
		JavascriptExecutor r=(JavascriptExecutor) driver;
		r.executeScript("document.getElementById('d2').value='manager'");
		Thread.sleep(5000);
		driver.close();
	}
}
