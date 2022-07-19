package qsp;
/*To delete the text from a text field using clear()*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class deleteText {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			}
public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
/*
driver.get("http://demo.opensourcebilling.org/");
driver.findElement(By.id("email")).clear();
*/
driver.navigate().to("https://demo.actitime.com/login.do");

if(driver.findElement(By.xpath("//div[@class='atLogoImg']")).isDisplayed())
	//if(driver.findElement(By.className("atLogoImg")).isDisplayed())
	System.out.println("Logo displayed");
else
	System.out.println("Logo not displayed");
driver.close();
}
}
