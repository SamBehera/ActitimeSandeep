package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoScreenshot {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//Typecast the object to TakeScreenshot to access the method
		TakesScreenshot t=(TakesScreenshot) driver;
		//Press the print screen button by calling method.
		File src = t.getScreenshotAs(OutputType.FILE);
		//create the file in specific location
		File dest=new File("./Screenshot/ss.png");
		//Copy nd paste the screenshot 
		FileUtils.copyFile(src, dest);
		driver.close();
	}
}
