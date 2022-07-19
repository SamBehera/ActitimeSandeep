package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonEnabled {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
/*	driver.get("https://www.facebook.com/");
	if(driver.findElement(By.id("u_0_d_6p")).isEnabled())
		System.out.println("It's enabled");
	else
		System.out.println("it's disabled");
	driver.close();
not working
*/
	driver.navigate().to("https://demo.actitime.com/login.do");
	/*to get the text of forgot password*/
	System.out.println(driver.findElement(By.id("toPasswordRecoveryPageLink")).getText());
	/*to find the  tag name*/
	System.out.println(driver.findElement(By.id("toPasswordRecoveryPageLink")).getAttribute("href"));
driver.close();	
	}
}
