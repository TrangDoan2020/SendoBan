package pageObjects;

import commons.AbstractPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class ProductListOnSellerPageObject extends AbstractPage {
    WebDriver driver;

    Logger logger = Logger.getLogger(ProductListOnSellerPageObject.class.getSimpleName());

    public ProductListOnSellerPageObject(WebDriver _driver){
        driver = _driver;
    }
}
