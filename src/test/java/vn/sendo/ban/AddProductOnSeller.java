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
    String cateLv1 = "Thời trang nữ";
    String cateLv2 = "Đầm, váy";
    String cateLv3 = "Đầm xòe";
    String product_name ="Đầm xòe thời trang";
    String product_code = randomText();
    String productType = "Sản phẩm vật lý";
    //String stock_available = "Còn hàng";
    String unit = "Cái";
    String weight = "150";
    String carrier_package = "Chuyển phát hỏa tốc";
    String size = "28";
    String colour = "Hồng";
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
//        addProductOnSellerPageObject.closedBannerPopup2();
//        addProductOnSellerPageObject.closedBannerPopup3();
        addProductOnSellerPageObject.scrollLeftMenu();
        addProductOnSellerPageObject.clickLinkProduct();
        addProductOnSellerPageObject.clickLinkAddProduct();
        addProductOnSellerPageObject.closedProductPopup();
        addProductOnSellerPageObject.clickUploadImage();
        addProductOnSellerPageObject.clickAddFile();
        addProductOnSellerPageObject.selectAPhotoFromComputer(imagePath);
        addProductOnSellerPageObject.verifyFileUploadSuccess();
        addProductOnSellerPageObject.clickClosePopupUploadImage();
        addProductOnSellerPageObject.waitUploadPopupDisappear();
        addProductOnSellerPageObject.clickButtonChooseCategory();
        addProductOnSellerPageObject.clickChooseCategoryLevel1(cateLv1);
        addProductOnSellerPageObject.clickChooseCategoryLevel2(cateLv2);
        addProductOnSellerPageObject.clickChooseCategoryLevel3(cateLv3);
        addProductOnSellerPageObject.enterProductNameIntoTextbox(product_name);
        addProductOnSellerPageObject.enterProductCodeIntoTextbox(product_code);
        addProductOnSellerPageObject.checkProductType(productType);
//      addProductOnSellerPageObject.checkStockAvailable();
        addProductOnSellerPageObject.selectUnitItemFromDropDown("Đơn vị", unit);
        addProductOnSellerPageObject.enterWeightIntoTextbox(weight);
        addProductOnSellerPageObject.checkCarrierPackage(carrier_package);
        addProductOnSellerPageObject.scrollDownAddProduct();
        // Viết 1 cái step scroll down xuống tầm 300px để thấy các elements bên dưới rồi chạy các steps dưới
        addProductOnSellerPageObject.selectSizeItemFromDropDown("Chọn thuộc tính", size);
        addProductOnSellerPageObject.clickEsc();
        addProductOnSellerPageObject.clickColour();
        addProductOnSellerPageObject.selectColour(colour);
        addProductOnSellerPageObject.closePopUpColour();
        addProductOnSellerPageObject.scrollDownAddProduct();
        addProductOnSellerPageObject.enterPriceIntoTextbox(price);
        //addProductOnSellerPageObject.enterPriceIntoTextbox("(Trên 8.000 VNĐ)", price);
        addProductOnSellerPageObject.enterQuantityIntoTextbox(quantity);
        addProductOnSellerPageObject.enterSKUUserIntoTextbox(sku_user);
        addProductOnSellerPageObject.scrollDownAddProduct();
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
