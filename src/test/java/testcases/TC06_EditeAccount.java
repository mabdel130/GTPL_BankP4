package testcases;

import org.testng.annotations.Test;
import pages.P06_EditeAccountPage;

import static drivers.DriverHolder.getDriver;

public class TC06_EditeAccount extends BaseTest {

    static String  accountNO="40505955";

    @Test(priority = 1, description = "Edite Account With Valid Data")
    public void editeAccount_P() {
        // TODO: Edite customer Account
        new P06_EditeAccountPage(getDriver())
                .clickEditeAccountButton()
                .enterAccountID(accountNO)
                .clickSubmitButtonIDforAccount()
                .back();
        // put customer id and assertions

    }

}
