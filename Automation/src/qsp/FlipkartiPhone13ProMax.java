package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartiPhone13ProMax {
	static String ModelName;
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		driver.findElement(By.name("q")).sendKeys("iphone 13 pro max");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@class='Y5N33s'])[1]")).click();
		List<WebElement> model = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));

		//Using normal for loop		
		for(int i=0, j=0; i<model.size()&& j<price.size(); i++, j++) 
		{
			if(model.get(i).getText().contains("iPhone 13"))
			{
				System.out.println(model.get(i).getText() +" ===>> "+ price.get(i).getText());
				Thread.sleep(1000);
			}
		}
		/*	for(WebElement i:model) {
			ModelName = i.getText(); 
			System.out.println(ModelName);
		}
				for(WebElement j:price) {
			System.out.println(ModelName +" ==>> "+ j.getText());
		}*/
		driver.close();
	}
}
