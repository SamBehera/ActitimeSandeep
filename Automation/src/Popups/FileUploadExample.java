package Popups;

import java.io.File; Doubt

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException   {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("Link");
		Thread.sleep(3000);
		File f=new File("Relative");
		String absolutepath=f.getAbsolutePath();
		System.out.println(absolutepath);
	}
}
