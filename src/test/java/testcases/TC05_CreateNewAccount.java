package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.P05_CreateNewAccountPage;

import static drivers.DriverHolder.getDriver;

public class TC05_CreateNewAccount extends BaseTest{
    static String  customerID="40505955";
    @Test(priority =1,description = "CrateNewAccount")
    public void createNewAccount_p() {
        // TODO: CrateNewAccount
        new P05_CreateNewAccountPage(getDriver())
                .clickNewAccountButton()
                .enterCustomerIDtoCreateNewAccount( customerID)
                .enterInitialdeposit("1000")
                .clickSubmitButtontoCreateNewAccount()
                .back();

        // put customer id and assertions

    }
}
