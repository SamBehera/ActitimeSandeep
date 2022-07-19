package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbocActi {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().window().maximize();
		boolean s = driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")).isSelected();
		if(s==true)
			System.out.println("Checkbox is not selected.");
		else
			System.out.println("Checkbox is selected.");
		driver.close();
		}
}
