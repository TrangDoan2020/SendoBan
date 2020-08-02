package pageUIs;

public class AddProductOnSellerPageUI {
    public static final String POPUP_BANNER1 = "//span[@class='_2ee3b']";
    //public static final String POPUP_BANNER2 = "//span[@class='_2ee3b']";
    //public static final String POPUP_BANNER = "//i[@class= 'close_banner_dashboard']";
    //public static final String LNK_PRODUCT = "//a[@class='dropdown-toggle']//span[contains(text(),'Sản phẩm')]";
    public static final String LNK_PRODUCT = "//span[@class='d2ffa undefined d87aa _3a16b'][contains(text(),'Sản phẩm')]";
    //public static final String LNK_ADD_PRODUCT = "//a[contains(text(),'Đăng sản phẩm')]";
    public static final String LNK_ADD_PRODUCT = "//div[@class='leftMenu_2Tab']//li[2]//a[1]//span[1]";
    public static final String POPUP_PRODUCT = "//div[@class='modal-dialog modal-sm']//button[@class='btn btn-danger'][contains(text(),'Đồng ý')]";
    public static final String UPLOAD_IMAGE = "//button[contains(@class,'btn btn-success btn_up_img btn-sm upimg')]";
    public static final String ADD_FILES = "//a[@id='uploader_browse']";
    public static final String LOADING = "//div[@class='plupload_progress_bar']";
    public static final String TXT_ADD_FILES = "//li[@class = 'plupload_done']";
    public static final String CLOSE_POPUP_UPLOAD_IMAGE = "//div[@id='uploadImageModal']//button[@class='btn btn-default'][contains(text(),'Đóng')]";
    public static final String BTN_CHOOSE_CATEGORY = "//button[@class = 'btn_choice_cate md-trigger btn btn-primary']";
    public static final String CHOOSE_CATEGORY_LEVEL1 = "//div[@class='block-catefory']//span[contains(text(),'Thời trang nữ')]";
    public static final String CHOOSE_CATEGORY_LEVEL2 = "//div[@class='block-catefory']//span[contains(text(), 'Đầm, váy')]";
    public static final String CHOOSE_CATEGORY_LEVEL3 = "//div[@class='block-catefory']//label[contains(text(),'Đầm xòe')]";
    public static final String TXT_PRODUCT_NAME = "//input[@id='inputProductName']";
    public static final String TXT_PRODUCT_CODE = "//input[@id='inputProductCode']";
    public static final String RAD_PRODUCT_TYPE = "//label[contains(text(),'Sản phẩm vật lý')]";
    public static final String STOCK_AVAILABLE_CHECKBOX = "//input[@id='checkbox-con-hang']";
    public static final String DRP_UNIT = "//div[@class='selectize-input items not-full has-options']";
    public static final String TXT_WEIGHT = "//input[@id='inputvolume']";
    public static final String CARRIER_PACKAGE_CHECKBOX = "//label[@class='label_carrier_package_config']";
    public static final String CHOOSE_SIZE = "//div[@class='col-lg-12 block-size']//input[@placeholder='Chọn thuộc tính']";
    public static final String CLICK_COLOUR = "//div[@class='bg-color']";
    public static final String CHOOSE_COLOUR = "//label[contains(text(),'Cam')]";
    public static final String TXT_PRICE = "//input[@placeholder='(Trên 8.000 VNĐ)']";
    public static final String TXT_QUANTITY = "//td[6]//input[1]";
    public static final String TXT_SKU_USER = "//td[7]//input[1]";
    public static final String TXT_DESCRIPTION = "//label[contains(text(),'Nhập mô tả: 100-100000 ký tự')]";
    public static final String BTN_SUBMIT_PRODUCT = "//div[@class='col-lg-9 col-md-8']//button[3]";
}
