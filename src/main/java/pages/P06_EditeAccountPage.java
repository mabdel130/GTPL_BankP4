package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class P06_EditeAccountPage extends BasePage {

    public P06_EditeAccountPage(WebDriver driver) {
        super(driver);
    }
    // TODO: define locators using By
  //  private final By editeAccount_Button = By.xpath("//a[normalize-space()='Edit Account']");
    private  final  By Accountid_Text=By.xpath("//input[@name='accountno']");
    private final By editesubmit_Buttonid =By.xpath("//input[@name='AccSubmit']");

// ASSERTIONS AFTER GET I

    // TODO: public action methods
    public  P06_EditeAccountPage clickEditeAccountButton() {
        WebElement editeAccountButton = driver.findElement(By.xpath("//a[normalize-space()='Edit Account']"));
        // Use JavaScriptExecutor to click the button
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", editeAccountButton);
      //  shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((editeAccount_Button))).click();
        return new  P06_EditeAccountPage(driver);
    }
    public  P06_EditeAccountPage enterAccountID(String accountNO) {
        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((Accountid_Text))).sendKeys(accountNO);
        return new  P06_EditeAccountPage(driver);
    }
    public  P06_EditeAccountPage clickSubmitButtonIDforAccount() {
        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((editesubmit_Buttonid))).click();
        return new  P06_EditeAccountPage(driver);
    }
    // put customer id and assertions
}


