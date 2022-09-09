package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasePage {
    WebDriver d;
    public BasePage(WebDriver driver){
        this.d=driver;
        PageFactory.initElements(driver,this);
    }

    //implicit wait
    public void implicitWait (long time){
        d.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }

    public void waitForElementClickable(long timeToWait, WebElement element){
        WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(timeToWait));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    //click on element
    public void click(WebElement a){
        a.click();
    }
}
