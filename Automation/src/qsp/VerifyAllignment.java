package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAllignment {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)   {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement un = driver.findElement(By.id("username"));
		int x1 = un.getLocation().getX();
		WebElement pw = driver.findElement(By.xpath("//input[@type='password']"));
		int x2=pw.getLocation().getX();
		
		if(x1==x2)
			System.out.println("Passed");
		else
			System.out.println("Failed");
		driver.close();
		}
}
