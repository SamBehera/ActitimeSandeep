package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PolicyAlert {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");

		driver.findElement(By.id("dob")).click();
		WebElement mon = driver.findElement(By.className("ui-datepicker-month"));
		Select s1=new Select(mon);
		s1.selectByIndex(4);

		WebElement year = driver.findElement(By.className("ui-datepicker-year"));
		Select s2=new Select(year);
		s2.selectByValue("1997");

		WebElement day = driver.findElement(By.xpath("(//a[@class='ui-state-default'])[23]"));
		day.click();
		//Select s3=new Select(date); we can not use select class bcz this not a list.
		//s3.selectByValue("23");

		driver.findElement(By.id("alternative_number")).sendKeys("987657896450");
		driver.findElement(By.id("renew_policy_submit")).click();

		String em = driver.findElement(By.id("policynumberError")).getText();
		if(em.equalsIgnoreCase("Please enter valid Policy No."))
			System.out.println("Invalid policy num");
		else
			System.out.println("valid policy num");
		Thread.sleep(4000);
		driver.close();
	}
}
