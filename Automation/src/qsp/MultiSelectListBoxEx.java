package qsp;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*Write a script to select idly, vada, dosa and deselect it.*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListBoxEx {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Saumtitri%20Behera/OneDrive/QSpider/selenium/Hotel.html");
		WebElement MultiListbox = driver.findElement(By.id("mtr"));

		Select s=new Select(MultiListbox);
		s.selectByValue("i");
		s.selectByIndex(2);
		s.selectByVisibleText("Dosa");

		s.deselectByValue("i");
		s.deselectByIndex(2);
		s.deselectByVisibleText("Dosa");

		System.out.println(s.isMultiple()); 
		//To verify if the element is single list box or multi-select list box

		WebElement cpListbox = driver.findElement(By.id("cp"));
		Select s1=new Select(cpListbox);
		System.out.println(s1.getFirstSelectedOption().getText());

		List<WebElement> selectedOptions = s1.getAllSelectedOptions();
		int count= selectedOptions.size();
		System.out.println("Size is: :" +count);

		for(int i=0;i<count; i++) {
			System.out.println(s1.getAllSelectedOptions().get(i).getText());
		}

		WebElement mtrListbox = driver.findElement(By.id("mtr"));
		Select s2=new Select(mtrListbox);

		List<WebElement> selectedOption = s1.getOptions();
		for(int i=0;i<selectedOption.size(); i++) {
			System.out.println(s2.getOptions().get(i).getText());
		}

	/*	System.out.println("Without duplicates");
		Set<WebElement> e=new LinkedHashSet<WebElement>(selectedOption);
		e.clear();
		e.addAll(selectedOption);
		for(WebElement S:selectedOption) {
			System.out.println(S.getText());
		}*/
		driver.close();
	}
}
