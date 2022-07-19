package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyURL {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.seleniumhq.org/");
		String eURL=driver.getCurrentUrl();
		System.out.println(eURL);
		String cURL= "https://www.selenium.dev/";
		if(cURL.equals(eURL))
			System.out.println("Passed");
		else
			System.out.println("Failed");
		driver.close();
	}
}
