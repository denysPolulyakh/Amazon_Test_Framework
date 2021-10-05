package pageEvents;

import org.testng.Assert;
import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents {

    public void verifyLoginPageOpenedOrNot(){
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", LoginPageElements.loginText).size()>0, "Login page did not open");

    }
    public void enterEmailId() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", LoginPageElements.emailAddress).sendKeys("denys@gmail.com");
    }

}
