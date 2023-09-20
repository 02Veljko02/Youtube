package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BCPartizanChannel {
    private WebDriver driver;
    private By title = By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-browse[2]/div[3]/ytd-c4-tabbed-header-renderer/tp-yt-app-header-layout/div/tp-yt-app-header/div[2]/div[3]/div/div[1]/div/div[1]/ytd-channel-name/div/div/yt-formatted-string");

    public BCPartizanChannel(WebDriver driver) {
        this.driver = driver;
    }
    public String getPageTitle(){
        this.WaitForTitle();
        return driver.findElement(title).getText();
    }
    private void WaitForTitle(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(title));
    }
}
