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

    @FindBy(xpath = "//div[@class = 'top-links__left flex-wrap']//a[contains(text(), ' iPhone 13')]")
    private WebElement iphoneHotSaleLink;
    @FindBy(xpath = "/html/head/title/text()")
    private WebElement homePageTitle;
    @FindBy (xpath = "//a[@href='/ua/brand-samsung']")
    private WebElement samsungPageLink;





    //getters
    public WebElement getPhoneHotSaleLink() {
        return iphoneHotSaleLink;
    }
    public WebElement getTitleText() {
        return homePageTitle;
    }
    public WebElement getSamsungPageLink() {
        return samsungPageLink;
    }



    //methods
    public void searchByKeyWord(String keyword) {
        searchInput.sendKeys(keyword);
        d.findElement(By.xpath(SEARCH_BUTTON)).click();
    }


}
