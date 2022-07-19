package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBB_Headlines {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com/");
		List<WebElement> link = driver.findElements(By.xpath("//span[@class='top-list-item__bullet']/../h3"));
		for(WebElement HeadLines:link) {
			System.out.println(">>>> " + HeadLines.getText());
		}
		driver.close();
	}
}
