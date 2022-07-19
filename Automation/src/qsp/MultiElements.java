package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiElements {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://amazon.in/");
		List<WebElement> all_link = driver.findElements(By.tagName("a"));
		int count=all_link.size();
		System.out.println(count);
		for(int i=0;i<count; i++) {
		WebElement link=all_link.get(i);
		String text=link.getText();
		System.out.println(text);
		}
		driver.close();
	}
}
