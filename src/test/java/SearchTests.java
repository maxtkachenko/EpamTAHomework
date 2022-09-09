import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SearchTests extends BaseTest{
    @Test
    public void checkUrlForSearchKey(){
        getHomepage().searchByKeyWord("Samsung");
        Assert.assertTrue(getDriver().getCurrentUrl().contains("query=Samsung"));
    }
    @Test
    public void descriptionTextSearchResultsValidation() {
        getHomepage().searchByKeyWord("Motorola");
        for (WebElement listElement : getSearchResultsPage().getSearchResultsList()) {
            Assert.assertTrue(listElement.getText().contains("Motorola"));
        }
    }
}
