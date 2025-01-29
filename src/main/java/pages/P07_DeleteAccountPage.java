package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class P07_DeleteAccountPage extends BasePage {
    public P07_DeleteAccountPage(WebDriver driver) {
        super(driver);
    }

    // TODO: define locators using By
   // private final By deleteAccount_Button = By.xpath("//a[normalize-space()='Delete Account']");
    private final By deleteAccountid_Text = By.xpath("//input[@name='accountno']");
    private final By deletesubmit_Button = By.xpath("//input[@name='AccSubmit']");



    // TODO: public action methods
    public P07_DeleteAccountPage clickonDeleteAccountButton() {
        WebElement deleteAccountButton = driver.findElement(By.xpath("//a[normalize-space()='Delete Account']"));
        // Use JavaScriptExecutor to click the button
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", deleteAccountButton);
        //  shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((editeAccount_Button))).click();
        return new P07_DeleteAccountPage(driver);
    }
    public P07_DeleteAccountPage enterAccountID_toDelete(String  AccountID) {
        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((deleteAccountid_Text))).sendKeys( AccountID);
        return new P07_DeleteAccountPage(driver);
    }
    public P07_DeleteAccountPage clickSubmitButtonIDtodelete() {
        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((deletesubmit_Button))).click();
        return new P07_DeleteAccountPage(driver);
    }
    // put  Account id and assertions


}
