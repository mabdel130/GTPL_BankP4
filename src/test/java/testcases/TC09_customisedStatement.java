package testcases;

import org.testng.annotations.Test;
import pages.P09_CustomizedStatementPage;

import static drivers.DriverHolder.getDriver;
import static util.Utlity.generateRandomDate;
import static util.Utlity.shuffleString;

public class TC09_customisedStatement extends BaseTest {
    static String accountno="40505955";
    static String startingdate=generateRandomDate( 1900,2020);
    static String endingdate=generateRandomDate( 2021,2040);
    static String lowerlimit= String.valueOf(1000);
static String transactionNumbers=shuffleString();
    @Test(priority = 1, description = "customised_Statement ")
    public void customised_Statement_P() {
        // TODO: customised_Statement
        new P09_CustomizedStatementPage(getDriver())
                .clickcustomised_StatementButton()
                .enterAccountno( accountno)
                .enterStartingDate(startingdate)
                .enterEndingDate(endingdate)
                .enterAmount_Lower_Limit(lowerlimit)
                .enternumber_ofTransaction(transactionNumbers)
                .clickSubmitButton()
                .back();

    }
}