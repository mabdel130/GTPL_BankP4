package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class P09_CustomizedStatementPage extends BasePage{
    public P09_CustomizedStatementPage(WebDriver driver) {
        super(driver);
    }

    // TODO: define locators using By
    private final By customised_Statement_Button = By.xpath("//a[normalize-space()='Customised Statement']");
    private final By Account_No_Text = By.xpath("//input[@name='accountno']");
    private final By starting_date_Text = By.xpath("//input[@name='fdate']");
    private final By ending_date_Text = By.xpath("//input[@name='tdate']");
    private final By Amount_Lower_Limit_Text = By.xpath("//input[@name='loweramt']");
    private final By number_ofTransaction_Text = By.xpath("//input[@name='tranno']");
    private final By submit_Button = By.xpath("//input[@name='AccSubmit']");

// get customer id  and assertion

    // TODO: public action methods
    public P09_CustomizedStatementPage clickcustomised_StatementButton() {
        WebElement customised_Statement = driver.findElement(By.xpath("//a[normalize-space()='Customised Statement']"));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", customised_Statement);
       // shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((customised_Statement_Button))).click();
        return new P09_CustomizedStatementPage(driver);
    }
    public P09_CustomizedStatementPage enterAccountno(String accountno) {
        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((Account_No_Text))).sendKeys(accountno);
        return new P09_CustomizedStatementPage(driver);
    }

    public <staringdate> P09_CustomizedStatementPage enterStartingDate(String startingdate) {
        //shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((starting_date_Text)));
        WebElement  startingdatelement = driver.findElement(starting_date_Text);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='" + startingdate + "';", startingdatelement);
        return new P09_CustomizedStatementPage(driver);
    }
    public <endingdate> P09_CustomizedStatementPage enterEndingDate(String endingdate) {
        //shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((ending_date_Text)));
        WebElement  endingdatelement = driver.findElement(ending_date_Text);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='" + endingdate + "';", endingdatelement);
        return new P09_CustomizedStatementPage(driver);
    }



    public P09_CustomizedStatementPage enterAmount_Lower_Limit(String lowerlimit) {
        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((Amount_Lower_Limit_Text))).sendKeys(lowerlimit);
        return new P09_CustomizedStatementPage(driver);
    }

    public P09_CustomizedStatementPage enternumber_ofTransaction(String transactionNumbers) {
        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((number_ofTransaction_Text))).sendKeys(transactionNumbers);
        return new P09_CustomizedStatementPage(driver);
    }


    public P09_CustomizedStatementPage clickSubmitButton() {
        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((submit_Button))).click();
        return new P09_CustomizedStatementPage(driver);
    }
// get customer id  and assertion
}
