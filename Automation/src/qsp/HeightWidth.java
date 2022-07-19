package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightWidth {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)   {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement un = driver.findElement(By.id("username"));
		int h1 = un.getSize().getHeight();
		int w1 = un.getSize().getWidth();
		WebElement pw = driver.findElement(By.xpath("//input[@type='password']"));
		int h2 = pw.getSize().getHeight();
		int w2 = pw.getSize().getWidth();
		if(h1==h2 && w1==w2)
			System.out.println("Passed" + h1 +" "+ w1);
		else
			System.out.println("Failed");
		driver.close();
	}
}