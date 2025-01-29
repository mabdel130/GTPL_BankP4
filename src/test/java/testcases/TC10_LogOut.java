package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.P10_LogoutPage;

import static drivers.DriverHolder.getDriver;
import static pages.BasePage.captureScreenshot;
import static pages.P10_LogoutPage.alertText;

public class TC10_LogOut  extends BaseTest {

    @Test(priority = 1, description = "logout ")
    public void logout_P() {
        // TODO: logout
        new P10_LogoutPage(getDriver())
                .clickonlogOut_ButtonButton()
                        .getsuccessmsg()
                        .back();
        captureScreenshot(getDriver(), "logout Succesfully");
        Assert.assertEquals(alertText, "You Have Succesfully Logged Out!!", "Alert message text is incorrect!");


    }
}