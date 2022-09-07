package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }
    private static final String SEARCH_BUTTON = "//button[@class='button-reset search-btn']";

    //webElements
    @FindBy(xpath = "//input[@id='input_search']")
    private WebElement searchInput;
    @FindBy(xpath = "///div[@class='mobile-icon']//i[@class='icon icon-search']")
    private WebElement searchIcon;

    //methods
    public void searchByKeyWord(String keyword) {
        searchInput.sendKeys(keyword);
        d.findElement(By.xpath(SEARCH_BUTTON)).click();
    }

}
