package vn.sendo.ban;

import commons.AbstractTest;
import commons.GlobalConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class AddProductOnSeller extends AbstractTest {
    String email = "0938586131";
    String password ="123456@";

    String imagePath = GlobalConstants.projectPath + "\\src\\main\\resources\\comayman.jpg";
    String product_name ="Đầm xòe thời trang";
    String product_code ="ĐX1907";
    //String stock_available = "Còn hàng";
    String unit = "Cái";
    String weight = "150";
    String carrier_package = "Chuyển phát hỏa tốc";
    String size = "28";
    String colour = "Cam";
    String price = "500000";
    String quantity = "1000";
    String sku_user = "SKU1";
    String description = "Đầm xòe thời trang Đầm xòe thời trang Đầm xòe thời trang Đầm xòe thời trang Đầm xòe thời trang Đầm xòe thời trang Đầm xòe thời trang Đầm xòe thời trang Đầm xòe thời trang";

    Wait<WebDriver> wait;

    @Test
    public void TC_AddProduct_01_Success(){

        logger.info("---TC_Add Product_01_Success---");

        loginOnSellerPage.loginOnSeller(email,password);
        addProductOnSellerPageObject.closedBannerPopup1();
        //addProductOnSellerPageObject.closedBannerPopup2();
        addProductOnSellerPageObject.scrollLeftMenu();
        addProductOnSellerPageObject.clickLinkProduct();
        addProductOnSellerPageObject.clickLinkAddProduct();
        addProductOnSellerPageObject.closedProductPopup();
        addProductOnSellerPageObject.clickUploadImage();
        addProductOnSellerPageObject.clickAddFile();
        addProductOnSellerPageObject.selectAPhotoFromComputer(imagePath);
        addProductOnSellerPageObject.clickClosePopupUploadImage();
        addProductOnSellerPageObject.waitUploadPopupDisappear();
        addProductOnSellerPageObject.clickButtonChooseCategory();
        addProductOnSellerPageObject.clickChooseCategoryLevel1();
        addProductOnSellerPageObject.clickChooseCategoryLevel2();
        addProductOnSellerPageObject.clickChooseCategoryLevel3();
        addProductOnSellerPageObject.enterProductNameIntoTextbox(product_name);
        addProductOnSellerPageObject.enterProductCodeIntoTextbox(product_code);
        addProductOnSellerPageObject.checkProductType();
        //addProductOnSellerPageObject.checkStockAvailable();
        addProductOnSellerPageObject.selectUnit(unit);
        addProductOnSellerPageObject.enterWeightIntoTextbox(weight);
        addProductOnSellerPageObject.checkCarrierPackage(carrier_package);
        addProductOnSellerPageObject.clickChooseSize(size);
        addProductOnSellerPageObject.clickColour();
        addProductOnSellerPageObject.selectColour(colour);
        addProductOnSellerPageObject.enterPriceIntoTextbox(price);
        addProductOnSellerPageObject.enterQuantityIntoTextbox(quantity);
        addProductOnSellerPageObject.enterSKUUserIntoTextbox(sku_user);
        addProductOnSellerPageObject.enterDescriptionIntoTextbox(description);
        addProductOnSellerPageObject.clickSubmitProduct();


//        String actualResult = loginOnSellerPage.getErrorMessage();
//        System.out.println(actualResult);
//        String expectedResult = PropertiesUtils.readPropertiesValue("EMPTY_PASSWORD_ERROR_MESSAGE");
//
//        Assert.assertEquals(actualResult, expectedResult,"Error message is not matched!");
//
//        loginPage.quitLoginPopup();
    }
}
