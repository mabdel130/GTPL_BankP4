package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_LoginPage;

import static drivers.DriverHolder.getDriver;
import static pages.BasePage.captureScreenshot;
import static pages.P01_LoginPage.actualMessagefor_Login;
import static pages.P01_LoginPage.expected_Messagefor_Login;

public class TC01_Login extends BaseTest {

    @Test(priority = 1, description = "Login to GTPL With Valid Data")
    public void login_to_my_account_With_Valid_data_P(){
        // TODO: login to app
        new P01_LoginPage(getDriver())
                .enterUsername(usernamelogin)
                .enterPassword(passwordlogin)
                .clickLoginButton()
                .getconfirmationtextforlogin();
        captureScreenshot(getDriver(), "LoginWithValid Data");
        Assert.assertEquals(actualMessagefor_Login, expected_Messagefor_Login, "Text does not match!");


    }


}


