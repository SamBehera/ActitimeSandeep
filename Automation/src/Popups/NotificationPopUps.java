package Popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUps {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notification");
		
		WebDriver driver=new ChromeDriver(options);
		/*It's taking options as an argument to open the browser with default settings.*/
		driver.manage().window().maximize();
		driver.get("https://www.cardekho.com/");
	}
}
