package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        this.backToLoginPage();
        driver.manage().window().maximize();
    }
    @BeforeMethod
    public void backToLoginPage(){
        driver.get("https://www.youtube.com/");
        homePage = new HomePage(driver);
    }
    @AfterClass
    public void turnOff(){
        driver.quit();
    }
}


