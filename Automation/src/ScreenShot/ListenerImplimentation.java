package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;

import com.actiTime.generics.BaseClass;

public class ListenerImplimentation extends BaseClass implements ITestListener{
	String res=result.getName();
	TakesScreenshot t=(TakesScreenshot) driver;
	//Press the print screen button by calling method.
	File src = t.getScreenshotAs(OutputType.FILE);
	//create the file in specific location
	File dest=new File("./Screenshot/" +res+ ".png");
	//Copy nd paste the screenshot 
	try {
	FileUtils.copyFile(src, dest);
	}
	catch(IOException e) {
	}

}
