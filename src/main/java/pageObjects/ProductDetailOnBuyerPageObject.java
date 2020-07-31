package pageObjects;

import commons.AbstractPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class ProductDetailOnBuyerPageObject extends AbstractPage {
    WebDriver driver;

    Logger logger = Logger.getLogger(ProductDetailOnBuyerPageObject.class.getSimpleName());

    public ProductDetailOnBuyerPageObject(WebDriver _driver){
        driver = _driver;
    }
}
