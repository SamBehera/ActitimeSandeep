package qsp;
/*Q. Write a script to print all the options present in MTR list box without any for loop*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WrappedElementMethod {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Saumtitri%20Behera/OneDrive/QSpider/selenium/Hotel.html");
		WebElement MultiListbox = driver.findElement(By.id("mtr"));
		Select s=new Select(MultiListbox);
		String text=s.getWrappedElement().getText();
		System.out.println(text);
		driver.close();
	}
}
