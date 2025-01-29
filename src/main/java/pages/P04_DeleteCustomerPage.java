package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class P04_DeleteCustomerPage extends BasePage {
    public P04_DeleteCustomerPage(WebDriver driver) {
        super(driver);
    }

    // TODO: define locators using By
    private final By deleteCustomer_Button = By.xpath("//a[normalize-space()='Delete Customer']");
    private final By deletecustomerid_Text = By.xpath("//input[@name='cusid']");
    private final By deletesubmit_Button = By.xpath("//input[@name='AccSubmit']");



    // TODO: public action methods
    public P04_DeleteCustomerPage clickonDeletecustomerButton() {
        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((deleteCustomer_Button))).click();
        return new P04_DeleteCustomerPage(driver);
    }
    public P04_DeleteCustomerPage enterCustomerID_toDelete(String customerID) {
        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((deletecustomerid_Text))).sendKeys(customerID);
        return new P04_DeleteCustomerPage(driver);
    }
    public P04_DeleteCustomerPage clickSubmitButtonIDtodelete() {
        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((deletesubmit_Button))).click();
        return new P04_DeleteCustomerPage(driver);
    }
    // put customer id and assertions


}
