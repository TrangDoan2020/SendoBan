package pageUIs;

public class AddProductOnSellerPageUI {
    public static final String POPUP_BANNER = "//span[@class='_2ee3b']";
    public static final String POPUP_BANNER2 = "//span[@class='_2ee3b']";
    public static final String POPUP_BANNER3 = "//span[@class='_2ee3b']";
    //public static final String POPUP_BANNER = "//i[@class= 'close_banner_dashboard']";
    //public static final String LNK_PRODUCT = "//a[@class='dropdown-toggle']//span[contains(text(),'Sản phẩm')]";
    public static final String LNK_PRODUCT = "//span[@class='d2ffa undefined d87aa _3a16b'][contains(text(),'Sản phẩm')]";
    //public static final String LNK_ADD_PRODUCT = "//a[contains(text(),'Đăng sản phẩm')]";
    public static final String LNK_ADD_PRODUCT = "//div[@class='leftMenu_2Tab']//li[2]//a[1]//span[1]";
    public static final String POPUP_PRODUCT = "//div[@class='modal-dialog modal-sm']//button[@class='btn btn-danger'][contains(text(),'Đồng ý')]";
    public static final String UPLOAD_IMAGE = "//button[contains(@class,'btn btn-success btn_up_img btn-sm upimg')]";
    public static final String ADD_FILES = "//a[@id='uploader_browse']";
    public static final String TEXT_UPLOAD_SUCCESS = "//span[@class='plupload_upload_status'][text()='%s']";
    public static final String LOADING = "//div[@class='plupload_progress_bar']";
    public static final String TXT_ADD_FILES = "//li[@class = 'plupload_done']";
    public static final String CLOSE_POPUP_UPLOAD_IMAGE = "//div[@id='uploadImageModal']//button[@class='btn btn-default'][contains(text(),'Đóng')]";
    public static final String BTN_CHOOSE_CATEGORY = "//button[@class = 'btn_choice_cate md-trigger btn btn-primary']";
    public static final String CHOOSE_CATEGORY_LEVEL1 = "//div[@class='block-catefory']//span[contains(text(),'%s')]";
    public static final String CHOOSE_CATEGORY_LEVEL2 = "//div[@class='block-catefory']//span[contains(text(), '%s')]";
    public static final String CHOOSE_CATEGORY_LEVEL3 = "//div[@class='block-catefory']//label[contains(text(),'%s')]";
    public static final String TXT_PRODUCT_NAME = "//input[@id='inputProductName']";
    public static final String TXT_PRODUCT_CODE = "//input[@id='inputProductCode']";
    public static final String RAD_PRODUCT_TYPE = "//label[contains(text(),'%s')]";
    public static final String STOCK_AVAILABLE_CHECKBOX = "//input[@id='checkbox-con-hang']";
    public static final String UNIT_TEXTBOX = "//input[@placeholder='%s']";
    public static final String ITEM_FROM_DROPDOWN = "//div[contains(@class,'option') and text()='%s']";
    //public static final String DRP_UNIT = "//div[@class='option selected']";
    public static final String TXT_WEIGHT = "//input[@id='inputvolume']";
    public static final String CARRIER_PACKAGE_CHECKBOX = "//label[@class='label_carrier_package_config']";
    //public static final String SIZE_TEXTBOX = "//div[label/span[text()='%s']]/following-sibling::div//div[contains(@class,'selectize-input')]/input";
    public static final String SIZE_TEXTBOX = "//div[@class='col-lg-12 block-size']//input[@placeholder='%s']";
    public static final String CLICK_COLOUR = "//div[@class='bg-color']";
    public static final String CHOOSE_COLOUR = "//label[contains(text(),'%s')]";
    public static final String CLOSE_CHOOSE_COLOUR = "//span[@class='list-color-close']";
    public static final String TXT_PRICE = "//input[@placeholder='(Trên 8.000 VNĐ)']";
    //public static final String TXT_PRICE = "//input[@placeholder='%s']";
    public static final String TXT_QUANTITY = "//td[6]//input[1]";
    public static final String TXT_SKU_USER = "//td[7]//input[1]";
    public static final String ATTRIBUTE = "//div[label/span[text()='%s']]/following-sibling::div//div[contains(@class,'selectize-input')]/input";
    public static final String TXT_DESCRIPTION = "//iframe[@id='mce_0_ifr']";
    //public static final String TXT_DESCRIPTION = "//label[contains(text(),'Nhập mô tả: 100-100000 ký tự']";
    public static final String BTN_SUBMIT_PRODUCT = "//div[@class='col-lg-9 col-md-8']//button[3]";
    public static final String DESCRIPTION_ERROR_MESSAGE = "//div[@class='toast toast-warning']";
}
