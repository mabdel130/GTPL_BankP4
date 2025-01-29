package testcases;

import org.testng.annotations.Test;
import pages.P08_MiniStatementPage;

import static drivers.DriverHolder.getDriver;

public class TC08_MiniStatement extends  BaseTest{

    static String  customerID="40505955";

    @Test(priority = 1, description = "MiniStatement ")
    public void miniStatement_P() {
        // TODO: Delete  Account
        new P08_MiniStatementPage(getDriver())
                .clickonMiniStatementButton()
                .enterAccountID_toMiniStatement(customerID)
                .clickSubmitButtonIDtoMiniStatement()
                .back();

        // put customer id and assertions

    }



}
