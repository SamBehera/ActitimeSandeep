package qsp;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class DemoA
{
	static void testA(WebDriver driver){
		driver.get("http://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		driver.navigate().to("http://www.gmail.com");
		String title2=driver.getTitle();
		System.out.println(title2);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
		}
}
public class DemoB {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		DemoA.testA(driver);
		driver.manage().window().maximize();
		WebDriver driver1=new FirefoxDriver();
		DemoA.testA(driver1);
		/*to delete all cookies*/
		driver1.manage().deleteAllCookies();
		/*Maximizing the browser*/
		
	}
}
