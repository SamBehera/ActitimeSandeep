package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiLogin_PropertyFile {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException {
//		FileInputStream fis=new FileInputStream("C:\\\\Users\\\\Saumtitri Behera\\\\OneDrive\\\\QSpider\\\\selenium\\\\PropertyFIle.property");
		FileInputStream fis=new FileInputStream("./data/PropertyFIle.property");
		Properties p=new Properties();
		p.load(fis);

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(p.getProperty("url"));
		driver.findElement(By.id("username")).sendKeys(p.getProperty("un"));;
		driver.findElement(By.name("pwd")).sendKeys(p.getProperty("pwd"));
		driver.findElement(By.xpath("//a/div")).click();
		Thread.sleep(5000);
		driver.close();
	}
}
