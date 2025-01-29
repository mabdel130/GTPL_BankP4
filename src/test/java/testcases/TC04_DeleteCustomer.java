package testcases;

import org.testng.annotations.Test;
import pages.P04_DeleteCustomerPage;

import static drivers.DriverHolder.getDriver;

public class TC04_DeleteCustomer extends BaseTest{

    static String  customerID="40505955";

    @Test(priority = 1, description = "Delete Customer Account ")
    public void delete_Customer_Account() {
        // TODO: Delete Customer Account
       new P04_DeleteCustomerPage(getDriver())
               .clickonDeletecustomerButton()
               .enterCustomerID_toDelete(customerID)
               .clickSubmitButtonIDtodelete()
               .back();

        // put customer id and assertions

    }


}
