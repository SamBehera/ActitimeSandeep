package QUESTIONS;

import java.util.List;
/*Q. Write a script to print all the option present in MTR list box and deselect them in reverse order.*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*Q. Write a script to print all the option present in MTR list box and 
 * deselect them in reverse order.*/
public class selectAllOption {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Saumtitri%20Behera/OneDrive/QSpider/selenium/Hotel.html");
		WebElement MultiListbox = driver.findElement(By.id("mtr"));

		Select s=new Select(MultiListbox);
		List<WebElement> allOption = s.getOptions();
		int count=allOption.size();
		for(int i=0; i<count; i++) {
			s.selectByIndex(i);
		}
		for(int i=count-1; i>=0;i--) {
			s.deselectByIndex(i);
		}
		driver.close();
	}
}
