package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	public static void main(String[] args){
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		String title=driver.getTitle();
		System.out.println(title);
		driver.navigate().to("http://www.gmail.com");
		String title2=driver.getTitle();
		System.out.println(title2);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
		}
}
