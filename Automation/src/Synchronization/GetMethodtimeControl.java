package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodtimeControl {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS); 
//above statement To hold the execution time of get method for specified seconds.
		try {
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("Page loaded successfully within 5 sec");
		}
		catch (TimeoutException e) {
			System.out.println("Page is not loded successfuly within 5 sec");
		}
	}
}
