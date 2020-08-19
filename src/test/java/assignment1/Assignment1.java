package assignment1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	
	private WebDriver driver;
	
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
		driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        
        driver.findElement(By.linkText("Shifting Content")).click();
        driver.findElement(By.linkText(("Example 1: Menu Element"))).click();
        List<WebElement> menuItems =driver.findElements(By.tagName("li"));
        System.out.println(menuItems.size());
		
	}

}
