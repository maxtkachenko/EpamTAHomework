import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends BaseTest {
    @Test
    public void checkLoginInputField(){
        getHomepage().getSignInPageLink().click();
        getHomepage().implicitWait(10);
        Assert.assertTrue(getSignInPage().getEmailPhoneInput().isDisplayed());
    }
    @Test
    public void checkPasswordInputField(){
        getHomepage().getSignInPageLink().click();
        getHomepage().implicitWait(10);
        Assert.assertTrue(getSignInPage().getPasswordInput().isDisplayed());
    }
    @Test
    public void checkSubmitButton(){
        getHomepage().getSignInPageLink().click();
        getHomepage().implicitWait(10);
        Assert.assertTrue(getSignInPage().getSubmitButton().isDisplayed());
    }

}
