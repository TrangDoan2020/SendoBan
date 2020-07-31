package pageObjects;

import commons.AbstractPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class ProductDetailOnSellerPageObject extends AbstractPage {
    WebDriver driver;

    Logger logger = Logger.getLogger(ProductDetailOnSellerPageObject.class.getSimpleName());

    public ProductDetailOnSellerPageObject(WebDriver _driver){
        driver = _driver;
    }
}
