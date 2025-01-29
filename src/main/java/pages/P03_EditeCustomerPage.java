package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class P03_EditeCustomerPage extends BasePage {
    public P03_EditeCustomerPage(WebDriver driver) {
        super(driver);
    }
    // TODO: define locators using By
    private final By editeCustomer_Button = By.xpath("//a[normalize-space()='Edit Customer']");
    private  final  By customerid_Text=By.xpath("//input[@name='cusid']");
    private final By editesubmit_Buttonid =By.xpath("//input[@name='AccSubmit']");

// ASSERTIONS AFTER GET I

    // TODO: public action methods
    public P03_EditeCustomerPage clickEditecustomerButton() {
        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((editeCustomer_Button))).click();
        return new P03_EditeCustomerPage(driver);
    }
    public P03_EditeCustomerPage enterCustomerID(String customerID) {
        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((customerid_Text))).sendKeys(customerID);
        return new P03_EditeCustomerPage(driver);
    }
    public P03_EditeCustomerPage  clickSubmitButtonID() {
        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((editesubmit_Buttonid))).click();
        return new P03_EditeCustomerPage(driver);
    }
    // put customer id and assertions
}
