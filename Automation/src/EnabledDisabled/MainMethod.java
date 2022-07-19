package EnabledDisabled;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

 class LoginPage {
	private WebElement untbx,pwd, cl;

	public LoginPage(WebDriver driver) {
		untbx=driver.findElement(By.id("username"));
		pwd=driver.findElement(By.name("pwd"));
		cl=driver.findElement(By.xpath("//div[.='Login ']"));
	}
	public void SetLogin(String un, String pw) {
		untbx.sendKeys(un);
		pwd.sendKeys(pw);
		cl.click();
	}
}

public class MainMethod {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		LoginPage l=new LoginPage(driver);
		driver.navigate().refresh(); //This statement will geve stateleElel
		l.SetLogin("admin", "manager");
		
		
	}
}


