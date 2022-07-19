package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUp {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		Alert a = driver.switchTo().alert();
		a.dismiss();
		String rs = driver.findElement(By.id("demo")).getText();
		if(rs.equals("You Pressed Cancel"))
			System.out.println("Selected cancel");
		else
			System.out.println("Selected ok");
	Thread.sleep(3000);
		driver.close();
	}
}
