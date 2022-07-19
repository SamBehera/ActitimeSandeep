package qsp;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriResume {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, NoSuchElementException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("login_Layer")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("beherasaumitri174@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Saum@143");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		Thread.sleep(5000);
		try {
		driver.findElement(By.xpath("//div[@class='crossIcon chatBot chatBot-ic-cross']")).click();
		}
		catch(NoSuchElementException e) {
			System.out.println("Chat bot didn't poped up.");
		}
		driver.findElement(By.xpath("//div[@class='btn btn-block btn-large white-text']")).click();
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.id("attachCV"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(5000); 
		
		File ref=new File("./data/Saumitri Behera Resume.pdf");
		Thread.sleep(6000);
		String s=ref.getAbsolutePath();
		//element.sendKeys("C:\\Users\\Saumtitri Behera\\OneDrive\\ResumeNishu Resume.pdf"); It's absolute path
		element.sendKeys(s);
		Thread.sleep(10000);
		//element.click(); it's wrong
		System.out.println("Resume updated sucessfully");
		
		driver.close();
	}
}
