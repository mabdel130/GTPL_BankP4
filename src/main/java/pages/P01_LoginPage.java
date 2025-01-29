package pages;

import actions.CustomeDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class P01_LoginPage extends BasePage {

    // TODO: constructor to intailize webdriver.
    public P01_LoginPage(WebDriver driver) {
        super(driver);
    }

    // TODO: define locators using By
    private final By UserID = By.xpath("//input[@name='uid']");
    private final By PASSWORD_TEXT = By.xpath("//input[@name='password']");
    private final By LOGIN_BUTTON = By.xpath("//input[@name='btnLogin']");
    private final By actual_assertion_Text = By.xpath("//a[normalize-space()='Demo Site']");
    public static String expected_Messagefor_Login = "Demo Site";
    public static String actualMessagefor_Login;

    // TODO: public action methods
    public P01_LoginPage enterUsername(String UseriD) {
       shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((UserID))).sendKeys(UseriD);
        return new P01_LoginPage(driver);
    }
    public P01_LoginPage enterPassword(String password) {
        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((PASSWORD_TEXT))).sendKeys(password);
        return new P01_LoginPage(driver);
    }
    public P01_LoginPage clickLoginButton()  {
        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((LOGIN_BUTTON))) .click();
        return new P01_LoginPage(driver);
    }
    public P01_LoginPage getconfirmationtextforlogin()  {
        actualMessagefor_Login=longWait(driver).until(ExpectedConditions.visibilityOfElementLocated((actual_assertion_Text))).getText();
        return new P01_LoginPage(driver);
    }
}
