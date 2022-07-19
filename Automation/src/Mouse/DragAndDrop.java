package Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		
		WebElement source = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement target = driver.findElement(By.xpath("//h1[text()='Block 4']"));
		Thread.sleep(4000);

		Actions dragdrop=new  Actions(driver);
		dragdrop.dragAndDrop(source, target).perform();
		
		System.out.println("Successfully moved.");
		Thread.sleep(4000);
		driver.close();
	}
}
