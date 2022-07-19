package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadPopUp {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://selenium.dev/downloads");
		Robot a=new Robot();
		a.keyPress(KeyEvent.VK_CONTROL);
		a.keyPress(KeyEvent.VK_P);
		a.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		
		a.keyPress(KeyEvent.VK_TAB);
		a.keyRelease(KeyEvent.VK_TAB);
		a.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		
		a.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		a.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		
		a.keyPress(KeyEvent.VK_1);
		a.keyPress(KeyEvent.VK_MINUS);
		a.keyPress(KeyEvent.VK_2);
		
		a.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		a.keyPress(KeyEvent.VK_D);
		a.keyPress(KeyEvent.VK_ENTER);
		
		driver.close();
	}
}
