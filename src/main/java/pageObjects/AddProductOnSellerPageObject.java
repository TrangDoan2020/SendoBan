package pageObjects;

import commons.AbstractPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageUIs.AddProductOnSellerPageUI;
import org.openqa.selenium.JavascriptExecutor;

public class AddProductOnSellerPageObject extends AbstractPage {
    WebDriver driver;

    Logger logger = Logger.getLogger(AddProductOnSellerPageObject.class.getSimpleName());

    public AddProductOnSellerPageObject(WebDriver _driver){
        driver = _driver;
    }

    public void closedBannerPopup1(){
        logger.info("Closed banner popup");
        closePopup(driver, AddProductOnSellerPageUI.POPUP_BANNER1);
    }

    public void closedBannerPopup2(){
        logger.info("Closed banner popup");
        closePopup(driver, AddProductOnSellerPageUI.POPUP_BANNER2);
    }

    public void scrollLeftMenu(){
        logger.info("Scroll Left Menu");
        scrollWithInElement(driver);
    }

    public void clickLinkProduct(){
        logger.info("Click link Product");
        clickElement(driver, AddProductOnSellerPageUI.LNK_PRODUCT);
    }

    public void clickLinkAddProduct(){
        logger.info("Click link Add Product");
        clickElement(driver, AddProductOnSellerPageUI.LNK_ADD_PRODUCT);
    }

    public void closedProductPopup(){
        logger.info("Closed product popup");
        closePopup(driver, AddProductOnSellerPageUI.POPUP_PRODUCT);
    }

    public void clickUploadImage(){
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)");
        logger.info("Click Upload Image");
        clickElement(driver, AddProductOnSellerPageUI.UPLOAD_IMAGE);
    }

    public void clickAddFile(){
        logger.info("Click Add File");
        clickElement(driver, AddProductOnSellerPageUI.ADD_FILES);
    }

    public void selectAPhotoFromComputer(String filePath){
        logger.info("Select a photo from computer");
        uploadFileWithRobot(filePath);
    }

    public void clickClosePopupUploadImage(){
        logger.info("Click close popup upload image");
        waitToElementsIsNotVisible(driver, 5, AddProductOnSellerPageUI.LOADING);
        //clickElement(driver, AddProductOnSellerPageUI.TXT_ADD_FILES);
        clickElement(driver, AddProductOnSellerPageUI.CLOSE_POPUP_UPLOAD_IMAGE);
        //waitToElementVisible(driver, 10, AddProductOnSellerPageUI.CLOSE_POPUP_UPLOAD_IMAGE);
    }

    public void waitUploadPopupDisappear(){
        logger.info("Wait upload popup disappear");
        waitToElementsIsNotVisible(driver, 5, AddProductOnSellerPageUI.CLOSE_POPUP_UPLOAD_IMAGE);
    }

    public void clickButtonChooseCategory(){
        logger.info("Click button choose Category");
        clickElement(driver, AddProductOnSellerPageUI.BTN_CHOOSE_CATEGORY);
    }

    public void clickChooseCategoryLevel1(){
        logger.info("Click choose category level 1");
        clickElement(driver, AddProductOnSellerPageUI.CHOOSE_CATEGORY_LEVEL1);
    }

    public void clickChooseCategoryLevel2(){
        logger.info("Click choose category level 2");
        clickElement(driver, AddProductOnSellerPageUI.CHOOSE_CATEGORY_LEVEL2);
    }

    public void clickChooseCategoryLevel3(){
        logger.info("Click choose category level 3");
        clickElement(driver, AddProductOnSellerPageUI.CHOOSE_CATEGORY_LEVEL3);
    }

    public void enterProductNameIntoTextbox(String productName){
        logger.info("Enter Product Name " + productName + " into textbox");
        setText(driver, AddProductOnSellerPageUI.TXT_PRODUCT_NAME, productName);
    }

    public void enterProductCodeIntoTextbox(String productCode){
        logger.info("Enter Product Code " + productCode + " into textbox");
        setText(driver, AddProductOnSellerPageUI.TXT_PRODUCT_CODE, productCode);
    }

    public void checkProductType(){
        logger.info("Check product type");
        clickElement(driver, AddProductOnSellerPageUI.RAD_PRODUCT_TYPE);
    }

    public void checkStockAvailable(){
        logger.info("Check stock available");
        clickElement(driver, String.format(AddProductOnSellerPageUI.STOCK_AVAILABLE_CHECKBOX));
    }

    public void selectUnit(String unit){
        logger.info("Select Unit");
        WebElement element = findElementByXpath(driver, AddProductOnSellerPageUI.DRP_UNIT);
        selectOptionFromDropdown(element, unit);
    }

    public void enterWeightIntoTextbox(String weight){
        logger.info("Enter Product Code " + weight + " into textbox");
        setText(driver, AddProductOnSellerPageUI.TXT_WEIGHT, weight);
    }

    public void checkCarrierPackage(String carrierpackage){
        logger.info("Check carrier package");
        clickElement(driver, String.format(AddProductOnSellerPageUI.CARRIER_PACKAGE_CHECKBOX, carrierpackage));
    }

    public void clickChooseSize(String size){
        logger.info("Click Choose Size");
        WebElement element = findElementByXpath(driver, AddProductOnSellerPageUI.CHOOSE_SIZE);
        selectOptionFromDropdown(element, size);
    }

    public void clickColour(){
        logger.info("Click Colour");
        clickElement(driver, AddProductOnSellerPageUI.CLICK_COLOUR);
    }

    public void selectColour(String colour){
        logger.info("Select Colour");
        clickElement(driver, String.format(AddProductOnSellerPageUI.CHOOSE_COLOUR, colour));
    }

    public void enterPriceIntoTextbox(String price){
        logger.info("Enter Price " + price + " into textbox");
        setText(driver, AddProductOnSellerPageUI.TXT_PRICE, price);
    }

    public void enterQuantityIntoTextbox(String quantity){
        logger.info("Enter Quantity " + quantity + " into textbox");
        setText(driver, AddProductOnSellerPageUI.TXT_PRICE, quantity);
    }

    public void enterSKUUserIntoTextbox(String skuuser){
        logger.info("Enter SKU User " + skuuser + " into textbox");
        setText(driver, AddProductOnSellerPageUI.TXT_SKU_USER, skuuser);
    }

    public void enterDescriptionIntoTextbox(String description){
        logger.info("Enter Description " + description + " into textbox");
        setText(driver, AddProductOnSellerPageUI.TXT_SKU_USER, description);
    }

    public void clickSubmitProduct(){
        logger.info("Click submit product");
        clickElement(driver, AddProductOnSellerPageUI.BTN_SUBMIT_PRODUCT);
    }
}
