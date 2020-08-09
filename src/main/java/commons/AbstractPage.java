package commons;

import org.json.JSONObject;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class AbstractPage {
    WebDriverWait wait;

    public static String sendApiRequest(String method, String source, String payload, String authorizationCode) {
        System.out.println("************************************************");
        System.out.println("Start to request with authorization ...");
        System.out.println("Method: " + method);
        System.out.println("Source: " + source);
        System.out.println("Payload: " + payload);
        System.out.println("Token: " + authorizationCode);
        assert (source != "" && source != null) : "API link is empty";

        String response = "";
        URL url = null;
        BufferedReader bufReader = null;
        HttpURLConnection conn = null;

        try {
            url = new URL(source);
            conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod(method);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Accept-Charset", "UTF-8");
            conn.setRequestProperty("ReCaptchaResponse", "smc@123456");
            //conn.setRequestProperty("Accept-Encoding", "gzip, deflate");
            if(authorizationCode != null) {
                conn.setRequestProperty("Authorization", authorizationCode);
            }
            conn.setDoOutput(true);
            if(!payload.equals("")){
                DataOutputStream outStream = new DataOutputStream(conn.getOutputStream());
                outStream.write(payload.getBytes());
                outStream.flush();
                outStream.close();
            }

            System.out.println("ResponseCode: " + conn.getResponseCode());
            if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                bufReader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            } else {
                bufReader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("---\nAPI Controller got an " + ioe.getClass().getName() + "\n---");
        } finally {
            try {
                response = bufReader.readLine();
                if (bufReader != null) {
                    bufReader.close();
                }
                conn.disconnect();
            }catch (Exception e){
                System.out.println(123454);
            }
        }
        if(!response.contains("\"")) {
            //response = StringEscapeUtils.unescapeJava(response);
        }
        System.out.println("Get the response after run: " + response);
        System.out.println("************************************************");
        return response;
    }

    public static void loginWithApi(WebDriver driver, String username, String password){
        String url = "https://seller-api.sendo.vn/api/token/web";
        JSONObject account = new JSONObject();
        account.put("username", username);
        account.put("password", password);
        String response = sendApiRequest("POST", url, account.toString(), "");
        String token = new JSONObject(response).getJSONObject("result").getString("token");
        System.out.println(token);
        Cookie cookie = new Cookie("token_seller_api",token);
        driver.manage().addCookie(cookie);
        driver.navigate().refresh();
    }

    // Wait Element
    public void waitToElementVisible(WebDriver driver, long timeOuts, String locator){
        wait = new WebDriverWait(driver, timeOuts);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void waitToElementsVisible(WebDriver driver, long timeOuts, String locator){
        wait = new WebDriverWait(driver, timeOuts);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(locator)));
    }

    public void waitToElementsIsNotVisible(WebDriver driver, long timeOuts, String locator){
        wait = new WebDriverWait(driver, timeOuts);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locator)));
    }

    // Find Elements
    public WebElement findElementByXpath(WebDriver driver, String locator){
        waitToElementVisible(driver,20,locator);
        return driver.findElement(By.xpath(locator));
    }

    public List<WebElement> findElementsByXpath (WebDriver driver, String locator){
        waitToElementsVisible(driver,20, locator);
        return driver.findElements(By.xpath(locator));
    }

    // Actions
    public void clickElement(WebDriver driver, String locator){
        findElementByXpath(driver, locator).click();
    }

    public void clickElements(WebDriver driver, String locator){
        List<WebElement> btnEdit = findElementsByXpath(driver, locator);
        if (btnEdit.size()>0){
            btnEdit.get(1).click();
        }
    }

    public void setText(WebDriver driver, String locator, String value){
        findElementByXpath(driver, locator).sendKeys(value);
    }

    // Get text
    public String getTextElement(WebDriver driver, String locator){
        return findElementByXpath(driver, locator).getText();
    }

    // Clear Text
    public void clearText(WebDriver driver, String locator){
        findElementByXpath(driver, locator).sendKeys(Keys.CONTROL + "a", Keys.DELETE);
    }

    // Others
    public void closePopup(WebDriver driver, String locator){
        List<WebElement> elements = findElementsByXpath(driver,locator);
        if (elements.size() > 0){
            elements.get(0).click();
        }
    }

    public boolean isElementDisplayed(WebDriver driver, String locator){
        return findElementByXpath(driver,locator).isDisplayed();
    }

    public void uploadFileWithRobot (String filePath) {
        System.out.println(filePath);
        try {
            Thread.sleep(1000);
            StringSelection stringSelection = new StringSelection(filePath);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);

            Robot robot = null;

            try {
                robot = new Robot();
            } catch (AWTException e) {
                e.printStackTrace();
            }

            robot.delay(250);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.delay(150);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (Exception e) {

        }
    }

    public void selectOptionFromDropdown(WebElement element, String optionvalue){
        Select select = new Select(element);
        select.selectByVisibleText(optionvalue);
    }
//
//    public void selectOptionFromDropdown1(WebDriver driver, String locator){
//        //WebElement selectMyElement = driver.findElement(this.getObject(AddProductOnSellerPageUI.DRP_UNIT)));
//        WebElement selectMyElement = driver.findElement(this.getObject(By.xpath(locator))));
//        selectMyElement.click();
//
//        Actions keyDown = new Actions(driver);
//        keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();
//    }

    public void scrollWithInElement(WebDriver driver){
        EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
        eventFiringWebDriver.executeScript("document.querySelector('div[class=\"leftMenu_2Tab\"]').scrollTop = 400");
        //eventFiringWebDriver.executeScript("document.querySelector('span[class=\"d2ffa undefined d87aa _3a16b\"]').scrollTop = 400");
    }

    public void scrollDown(WebDriver driver){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,400)", "");
    }

    public static void useEsc(WebDriver driver){
       Actions action = new Actions(driver);
        action.sendKeys(Keys.ESCAPE).perform();
    }
}
