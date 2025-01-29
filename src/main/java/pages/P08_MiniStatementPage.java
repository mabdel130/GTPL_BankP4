package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class P08_MiniStatementPage extends BasePage{
    public P08_MiniStatementPage(WebDriver driver) {
        super(driver);
    }

    // TODO: define locators using By
    // private final By MiniStatement_Button = By.xpath("//a[normalize-space()='Mini Statement']");
    private final By MiniStatementAccountid_Text = By.xpath("//input[@name='accountno']");
    private final By MiniStatementsubmit_Button = By.xpath("//input[@name='AccSubmit']");



    // TODO: public action methods
    public P08_MiniStatementPage clickonMiniStatementButton() {
        WebElement MiniStatementButton = driver.findElement(By.xpath("//a[normalize-space()='Mini Statement']"));
        // Use JavaScriptExecutor to click the button
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", MiniStatementButton);
        //  shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((editeAccount_Button))).click();
        return new P08_MiniStatementPage(driver);
    }
    public P08_MiniStatementPage enterAccountID_toMiniStatement(String  AccountID) {
        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((MiniStatementAccountid_Text))).sendKeys( AccountID);
        return new P08_MiniStatementPage(driver);
    }
    public P08_MiniStatementPage clickSubmitButtonIDtoMiniStatement() {
        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((MiniStatementsubmit_Button))).click();
        return new P08_MiniStatementPage(driver);
    }
    // put  Account id and assertions
}
