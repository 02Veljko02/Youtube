package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.security.Key;

public class HomePage {
    private WebDriver driver;
    private By searchField = By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[4]/div[2]/ytd-searchbox/form/div[1]/div[1]/input");
    private By searchButton = By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon/yt-icon-shape/icon-shape/div");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void enterDesiredText(){
        driver.findElement(searchField).sendKeys("BC Partizan TV");
    }
    public BCPartizanTVSearchPage clickEnterButton(){
        WebElement button = driver.findElement(searchButton);
        Actions actions = new Actions(driver);
        actions.sendKeys(button,Keys.ENTER);
        return new BCPartizanTVSearchPage(driver);
    }
    public BCPartizanTVSearchPage clickSearchButton(){
        driver.findElement(searchButton).click();
        return new BCPartizanTVSearchPage(driver);
    }
}
