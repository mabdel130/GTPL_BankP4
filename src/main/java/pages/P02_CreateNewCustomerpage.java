package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class P02_CreateNewCustomerpage extends BasePage {
    public P02_CreateNewCustomerpage(WebDriver driver) {
        super(driver);
    }

    // TODO: define locators using By
    private final By new_customer_Button = By.xpath("//a[normalize-space()='New Customer']");
    private final By CustomerName_Text = By.xpath("//input[@name='name']");
    private final By date_of_Birth_Numbers = By.xpath("//input[@id='dob']");
    private final By address_Text = By.xpath("//textarea[@name='addr']");
    private final By city_Text = By.xpath("//input[@name='city']");
    private final By state_Text = By.xpath("//input[@name='state']");
    private final By pin_Text = By.xpath("//input[@name='pinno']");
    private final By telephoneNumber_Text = By.xpath("//input[@name='telephoneno']");
    private final By eMail_Text = By.xpath("//input[@name='emailid']");
    private final By submit_Button = By.xpath("//input[@name='sub']");

// get customer id  and assertion

    // TODO: public action methods
    public P02_CreateNewCustomerpage clickNewcustomerButton() {
        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((new_customer_Button))).click();
        return new P02_CreateNewCustomerpage(driver);
    }

    public P02_CreateNewCustomerpage enternewCustomername(String newcustomername) {
        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((CustomerName_Text))).sendKeys(newcustomername);
        return new P02_CreateNewCustomerpage(driver);
    }

    public <dateofBirth> P02_CreateNewCustomerpage enterDateofBirth(String dateofBirth) {
        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((date_of_Birth_Numbers)));
        WebElement dateOfBirthElement = driver.findElement(date_of_Birth_Numbers);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='" + dateofBirth + "';", dateOfBirthElement);
        return new P02_CreateNewCustomerpage(driver);
    }

    public P02_CreateNewCustomerpage enter_Address(String address) {
        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((address_Text))).sendKeys(address);
        return new P02_CreateNewCustomerpage(driver);
    }

    public P02_CreateNewCustomerpage enter_City(String city) {
        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((city_Text))).sendKeys(city);
        return new P02_CreateNewCustomerpage(driver);
    }

    public P02_CreateNewCustomerpage enter_State(String state) {
        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((state_Text))).sendKeys(state);
        return new P02_CreateNewCustomerpage(driver);
    }

    public P02_CreateNewCustomerpage enter_PIN(String pin) {
        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((pin_Text))).sendKeys(pin);
        return new P02_CreateNewCustomerpage(driver);
    }

    public P02_CreateNewCustomerpage enter_Telephone(String telephone) {
        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((telephoneNumber_Text))).sendKeys(telephone);
        return new P02_CreateNewCustomerpage(driver);
    }
    public P02_CreateNewCustomerpage enter_EMAIL(String email) {
        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((eMail_Text))).sendKeys(email);
        return new P02_CreateNewCustomerpage(driver);
    }
    public P02_CreateNewCustomerpage clickSubmitButton() {
        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated((submit_Button))).click();

        return new P02_CreateNewCustomerpage(driver);
    }


// get customer id  and assertion

}
