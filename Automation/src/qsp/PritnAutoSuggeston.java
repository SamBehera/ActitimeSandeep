package qsp;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
public class PritnAutoSuggeston {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//Open web browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");

		//search for java
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(4000);

		List<WebElement> allsuggg = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count=allsuggg.size();
		System.out.println(count);
		//Print all auto suggestion
		for(int i=0; i<count;i++) {
			String text=allsuggg.get(i).getText();
			System.out.println(text);
		}
		//click on first auto suggestion
		allsuggg.get(0).click();
		Thread.sleep(6000);
		driver.close();
	}
}
