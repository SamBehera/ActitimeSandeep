package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		/*Maximizing the browser*/
		driver.manage().window().maximize();
		
		/*to delete all cookies*/
		driver.manage().deleteAllCookies();
		
		/*to get the URL from the url bar*/
		driver.getCurrentUrl();
		
		/*to get HTML source code of the webpage*/
		driver.getPageSource();
	}
}
