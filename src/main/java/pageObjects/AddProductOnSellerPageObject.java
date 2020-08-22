package pageObjects;

import commons.AbstractPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageUIs.AddProductOnSellerPageUI;

public class AddProductOnSellerPageObject extends AbstractPage {
    WebDriver driver;

    Logger logger = Logger.getLogger(AddProductOnSellerPageObject.class.getSimpleName());

    public AddProductOnSellerPageObject(WebDriver _driver){
        driver = _driver;
    }

//    public void closedAllBannerPopup(){
//        logger.info("Closed all banner popup");
//        closeAllPopupOnSeller(driver, "//span[@class='_2ee3b']");
//    }

    public void closedBannerPopup1(){
        logger.info("Closed banner popup");
        closePopup(driver, AddProductOnSellerPageUI.POPUP_BANNER);
    }

    public void closedBannerPopup2(){
        logger.info("Closed banner popup");
        closePopup(driver, AddProductOnSellerPageUI.POPUP_BANNER2);
    }

    public void closedBannerPopup3(){
        logger.info("Closed banner popup");
        closePopup(driver, AddProductOnSellerPageUI.POPUP_BANNER3);
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

    public void verifyFileUploadSuccess(){
        logger.info("Verify file upload success");
        String locator = String.format(AddProductOnSellerPageUI.TEXT_UPLOAD_SUCCESS, "Đã xong 1/1");
        WebElement element = findElementByXpath(driver, locator);
        Assert.assertTrue(element.isDisplayed());
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

    public void clickChooseCategoryLevel1(String cateLv1){
        logger.info("Click choose category level 1");
        String locator = String.format(AddProductOnSellerPageUI.CHOOSE_CATEGORY_LEVEL1, cateLv1);
        clickElement(driver, locator);
    }

    public void clickChooseCategoryLevel2(String cateLv2){
        logger.info("Click choose category level 2");
        String locator = String.format(AddProductOnSellerPageUI.CHOOSE_CATEGORY_LEVEL2, cateLv2);
        clickElement(driver, locator);
    }

    public void clickChooseCategoryLevel3(String cateLv3){
        logger.info("Click choose category level 3");
        String locator = String.format(AddProductOnSellerPageUI.CHOOSE_CATEGORY_LEVEL3, cateLv3);
        clickElement(driver, locator);
    }

    public void enterProductNameIntoTextbox(String productName){
        logger.info("Enter Product Name " + productName + " into textbox");
        setText(driver, AddProductOnSellerPageUI.TXT_PRODUCT_NAME, productName);
    }

    public void enterProductCodeIntoTextbox(String productCode){
        logger.info("Enter Product Code " + productCode + " into textbox");
        setText(driver, AddProductOnSellerPageUI.TXT_PRODUCT_CODE, productCode);
    }

    public void checkProductType(String productType){
        logger.info("Check product type");
        String locator = String.format(AddProductOnSellerPageUI.RAD_PRODUCT_TYPE, productType);
        clickElement(driver, locator);
    }

    public void checkStockAvailable(){
        logger.info("Check stock available");
        clickElement(driver, AddProductOnSellerPageUI.STOCK_AVAILABLE_CHECKBOX);
    }

    public void selectUnitItemFromDropDown(String textBoxName, String item){
        logger.info("Select item from dropdown");
        String textBoxLocator = String.format(AddProductOnSellerPageUI.UNIT_TEXTBOX, textBoxName);
        clickElement(driver, textBoxLocator);
        String itemLocator = String.format(AddProductOnSellerPageUI.ITEM_FROM_DROPDOWN, item);
        clickElement(driver, itemLocator);
    }

    public void enterWeightIntoTextbox(String weight){
        logger.info("Enter Product Code " + weight + " into textbox");
        setText(driver, AddProductOnSellerPageUI.TXT_WEIGHT, weight);
    }

    public void checkCarrierPackage(String carrierpackage){
        logger.info("Check carrier package");
        clickElement(driver, String.format(AddProductOnSellerPageUI.CARRIER_PACKAGE_CHECKBOX, carrierpackage));
    }

    public void scrollDownAddProduct(){
        logger.info("Scroll Down Add Product");
        scrollDown(driver);
    }

    public void selectSizeItemFromDropDown(String textBoxName, String item){
        logger.info("Select item from dropdown");
        String textBoxLocator = String.format(AddProductOnSellerPageUI.SIZE_TEXTBOX, textBoxName);
        clickElement(driver, textBoxLocator);
        String itemLocator = String.format(AddProductOnSellerPageUI.ITEM_FROM_DROPDOWN, item);
        clickElement(driver, itemLocator);
    }

//    public void clickChooseSize(String size){
//        logger.info("Click Choose Size");
//        WebElement element = findElementByXpath(driver, AddProductOnSellerPageUI.CHOOSE_SIZE);
//        selectOptionFromDropdown(element, size);
//    }

    public void clickEsc() {
        useEsc(driver);
    }


    public void clickColour(){
        logger.info("Click Colour");
        clickElement(driver, AddProductOnSellerPageUI.CLICK_COLOUR);
    }

    public void selectColour(String colour){
        logger.info("Select Colour");
        clickElement(driver, String.format(AddProductOnSellerPageUI.CHOOSE_COLOUR, colour));
    }

    public void closePopUpColour(){
        closePopup(driver, AddProductOnSellerPageUI.CLOSE_CHOOSE_COLOUR);
    }

    public void enterPriceIntoTextbox(String price){
        logger.info("Enter Price " + price + " into textbox");
        setText(driver, AddProductOnSellerPageUI.TXT_PRICE, price);
    }

    public void enterQuantityIntoTextbox(String quantity){
        logger.info("Enter Quantity " + quantity + " into textbox");
        setText(driver, AddProductOnSellerPageUI.TXT_QUANTITY, quantity);
    }

    public void enterSKUUserIntoTextbox(String skuUser){
        logger.info("Enter SKU User " + skuUser + " into textbox");
        setText(driver, AddProductOnSellerPageUI.TXT_SKU_USER, skuUser);
    }


    public void chooseFabric(String textBoxName, String item){
        logger.info("Select item from dropdown");
        String textBoxLocator = String.format(AddProductOnSellerPageUI.ATTRIBUTE, textBoxName);
        clickElement(driver, textBoxLocator);
        String itemLocator = String.format(AddProductOnSellerPageUI.ITEM_FROM_DROPDOWN, item);
        clickElement(driver, itemLocator);
    }

    public void chooseSkirtLength(String skirtlength, String item){
        logger.info("Choose Attribute " + skirtlength + " into textbox");
        String textBoxLocator = String.format(AddProductOnSellerPageUI.ATTRIBUTE, skirtlength);
        clickElement(driver, textBoxLocator);
        String itemLocator = String.format(AddProductOnSellerPageUI.ITEM_FROM_DROPDOWN, item);
        clickElement(driver, itemLocator);
    }

    public void enterDescriptionIntoTextbox(String description){
        logger.info("Enter Description " + description + " into textbox");
        inputIframe(driver, AddProductOnSellerPageUI.TXT_DESCRIPTION);
        //setText(driver, AddProductOnSellerPageUI.TXT_DESCRIPTION, description);
    }

    public void clickSubmitProduct(){
        logger.info("Click submit product");
        clickElement(driver, AddProductOnSellerPageUI.BTN_SUBMIT_PRODUCT);
    }

    public String getDescriptionErrorMessage(){
        String actualResult = getTextElement(driver, AddProductOnSellerPageUI.DESCRIPTION_ERROR_MESSAGE);
        logger.info("Get Description error message " + actualResult);
        return actualResult;
    }
}
