package pageObjects;

import commons.AbstractPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class LoginOnSellerPageObject extends AbstractPage {
    WebDriver driver;

    Logger logger = Logger.getLogger(LoginOnSellerPageObject.class.getSimpleName());

    public LoginOnSellerPageObject(WebDriver _driver){
        driver = _driver;
    }

    public void loginOnSeller(String email, String password){
        loginWithApi(driver, email, password);
    }

}
