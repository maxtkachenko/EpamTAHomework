import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTest{

    @Test
    public void navigateToSamsung(){
        getHomepage().getSamsungPageLink().click();
        getHomepage().implicitWait(10);
        Assert.assertTrue(getDriver().getCurrentUrl().contains("brand-samsung"));
    }

}
