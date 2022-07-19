package DataDrivernTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoAssertion {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public void verifyTitle() {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		String actualTItle = driver.getTitle();
		String expectedTitle= "doogle";

/* NOt possible as it will not fail the test case. */		
//		if(actualTItle.equals(expectedTitle))
//			Reporter.log("Passed", true);
//		else
//			Reporter.log("Failed", true);
		
		
/*If else block doesn't have the ability to fail a test case. Hence, we go for Assert to verify the condition.*/		
		Assert.assertEquals(actualTItle, expectedTitle);
/*YOu can use the Assert.fail() to fail the test case while using if else condition*/	
//		if(actualTItle.equals(expectedTitle))
//		Reporter.log("Passed", true);
//	else
//		Reporter.log("Failed", true);
//		Assert.fail();
		
/*Using SoftAssert class*/
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actualTItle, expectedTitle);
		driver.close();
		sa.assertAll();

		
	}
}
