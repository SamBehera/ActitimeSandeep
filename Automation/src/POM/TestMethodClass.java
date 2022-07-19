package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestMethodClass {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//		System.setProperty("webdriver.`.driver", "./driver/msedgedriver.exe");

	}
	@Test
	public void testMethod() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		LoginPage i=new LoginPage(driver);
		PageFactory.initElements(driver, i);
		i.setLogin("admin", "manager");	
	}
}
