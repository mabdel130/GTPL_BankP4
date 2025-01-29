package testcases;

import org.testng.annotations.Test;

import pages.P03_EditeCustomerPage;

import static drivers.DriverHolder.getDriver;

public class TC03_EditeCustomer extends  BaseTest {
    static String  customerID="40505955";

    @Test(priority = 1, description = "Edite customer accountValid Data")
    public void editeCustomerAccount_P() {
        // TODO: Edite customer Account
        new P03_EditeCustomerPage(getDriver()).clickEditecustomerButton()
                .enterCustomerID(customerID)
                .clickSubmitButtonID()
                .back();
        // put customer id and assertions

    }
}
