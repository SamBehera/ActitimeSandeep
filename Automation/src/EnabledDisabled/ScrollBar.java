package EnabledDisabled;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBar {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.bbc.com/");
		JavascriptExecutor j=(JavascriptExecutor) driver;
//		int y = driver.findElement(By.xpath("(//a[@class='feature__link'])[1]")).getLocation().getY();
//		j.executeScript("window.scrollBy(0,"+y+")");
//		Thread.sleep(5000);
		/*scroll to the bollom of the webpgage*/
		j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		/*scroll to top of the webpage*/
		Thread.sleep(5000);
		j.executeScript("window.scrollTo(0,0)");
	}
}
