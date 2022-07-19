package com.actiTime.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	WebDriver driver;
	FileInputStream fis;
	Properties p;
	
	@BeforeTest 
	public void openBrowser() {
		Reporter.log("Open Browser", true);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void closeBrowser() {
		Reporter.log("Close Browser", true);
		driver.close();
	}
	
	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("Logged-in", true);
		fis=new FileInputStream("./data/PropertyFIle.property");
		p=new Properties();
		p.load(fis);
		driver.get(p.getProperty("url"));
		driver.findElement(By.id("username")).sendKeys(p.getProperty("un"));
		driver.findElement(By.name("pwd")).sendKeys(p.getProperty("pwd"));
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}

	@AfterMethod
	public void logout() {
		Reporter.log("Logged-out", true);
		driver.findElement(By.id("logoutLink")).click();
	}
}
