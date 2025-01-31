package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class P10_LogoutPage extends  BasePage {
    public P10_LogoutPage(WebDriver driver) {
        super(driver);
    }
    public static String alertText;
    // TODO: define locators using By
    private final By logOut_Button = By.xpath("//a[normalize-space()='Log out']");


    // TODO: public action methods
    public P10_LogoutPage clickonlogOut_ButtonButton() {
        WebElement logOut = driver.findElement(By.xpath("//a[normalize-space()='Log out']"));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", logOut);


        // shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(( logOut_Button))).click();
        return new P10_LogoutPage(driver);
    }
    public P10_LogoutPage getsuccessmsg() {
        shortWait(driver).until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
         alertText = alert.getText();
        alert.accept();
        return new P10_LogoutPage(driver);
    }
}