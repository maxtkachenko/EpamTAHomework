import Pages.HomePage;
import Pages.SearchResultsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class BaseTest {

    private WebDriver driver;

    @BeforeTest
    public void testsSetup() {
        //System.setProperty("webdriver.chrome.driver", Objects.requireNonNull(getClass().getClassLoader().getResource("chromedriver.exe")).getFile());
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://avic.ua/ua");
    }

    @AfterTest
    public void tearDownTest() {     driver.quit();    }

    //getter
    public WebDriver getDriver() {
        return driver;
    }

    //methods for creation pages instance
    public HomePage getHomepage() {
        return new HomePage(driver);
    }

    public SearchResultsPage getSearchResultsPage() {
        return new SearchResultsPage(getDriver());
    }

}
