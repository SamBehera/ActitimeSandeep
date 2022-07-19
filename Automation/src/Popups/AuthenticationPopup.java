package Popups;

import java.awt.AWTException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		/*Syntax" https://id:password@domainurl
		 * ID and password will be sent to the server 
		 * and the page will redirect to home page if credentials are correct
		 * or else, the same pop up will be display again*/
	//	driver.close();
	}
}
