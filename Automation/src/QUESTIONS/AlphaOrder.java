package QUESTIONS;

/* Q. Write a script to print all the option present in MTR list box in alphabetical order.*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class AlphaOrder {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Saumtitri%20Behera/OneDrive/QSpider/selenium/Hotel.html");
		WebElement MultiListbox = driver.findElement(By.id("mtr"));
		ArrayList<String> Listoption=new ArrayList<String>();
		Select s=new Select(MultiListbox);
		List<WebElement> allOptions = s.getOptions();
		int count=allOptions.size();
		for(int i=0; i<count; i++) {
			String text=allOptions.get(i).getText();
			Listoption.add(text);
		}
		Collections.sort(Listoption);
		for(String option:Listoption) {
			System.out.println(option);
		}
		driver.close();
	}
}
