package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.xml.xpath.XPath;

public class P05_CreateNewAccountPage extends BasePage {
    public P05_CreateNewAccountPage(WebDriver driver) {
        super(driver);
    }
    // TODO: define locators using By
    private final By new_Account_Button = By.xpath("//a[normalize-space()='New Account']");
    private final By idfornewAccount_Text = By.xpath("//input[@name='cusid']");
    private final By Initial_deposit_Text = By.xpath("//input[@name='inideposit']");
    private final By submit_Button = By.xpath("//input[@name='button2']");
    // put customer id and assertions
    // TODO: public action methods
    public P05_CreateNewAccountPage clickNewAccountButton() {
        WebElement newAccountButton = driver.findElement(By.xpath("//a[normalize-space()='New Account']"));
        // Use JavaScriptExecutor to click the button
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", newAccountButton);
        //shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((new_Account_Button))).click();
        return new P05_CreateNewAccountPage(driver);
    }


    public P05_CreateNewAccountPage enterCustomerIDtoCreateNewAccount(String customerID) {
        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((idfornewAccount_Text))).sendKeys(customerID);
        return new P05_CreateNewAccountPage(driver);
    }

    public P05_CreateNewAccountPage enterInitialdeposit(String intialdeposit) {
        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((Initial_deposit_Text))).sendKeys(intialdeposit);
        return new P05_CreateNewAccountPage(driver);
    }

    public P05_CreateNewAccountPage clickSubmitButtontoCreateNewAccount() {
        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((submit_Button))).click();
        return new P05_CreateNewAccountPage(driver);
        // put customer id and assertions
    }

}
