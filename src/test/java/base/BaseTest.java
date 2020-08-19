package base;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.HomePage;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        driver = new ChromeDriver();//instantiation
        driver.get("https://the-internet.herokuapp.com/");//is used to launch the browser and load a url

        homePage = new HomePage(driver);
//       List<WebElement> links = driver.findElements(By.tagName("a"));
//       System.out.println(links.size());
//       WebElement inputsLink = driver.findElement(By.linkText("Inputs"));//finds the first elem
//       inputsLink.click();
       //System.out.println(driver.getTitle());//get the title of the site or app
//        driver.quit();
    }
    @AfterClass
    public void tearDown() {
    	driver.quit();
    }
}
