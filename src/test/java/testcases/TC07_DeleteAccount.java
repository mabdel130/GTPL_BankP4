package testcases;

import org.testng.annotations.Test;
import pages.P07_DeleteAccountPage;

import static drivers.DriverHolder.getDriver;

public class TC07_DeleteAccount extends BaseTest{

    static String  customerID="40505955";

    @Test(priority = 1, description = "Delete Account ")
    public void delete_Account_P() {
        // TODO: Delete  Account
       new P07_DeleteAccountPage(getDriver())
               .clickonDeleteAccountButton()
               .enterAccountID_toDelete(customerID)
               .clickSubmitButtonIDtodelete()
               .back();


        // put customer id and assertions

    }


}
