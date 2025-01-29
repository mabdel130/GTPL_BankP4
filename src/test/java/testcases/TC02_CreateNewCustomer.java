package testcases;

import org.testng.annotations.Test;
import pages.P02_CreateNewCustomerpage;


import static drivers.DriverHolder.getDriver;
import static util.Utlity.*;

public class TC02_CreateNewCustomer extends  BaseTest {

    static String newcustomername = generateRandomFullName();
    static String dateofBirth=generateRandomDate( 1900,2022);
    static String address =generateRandomAddress();
     static String city = generateRandomCity();
     static  String state=generateRandomState();
     static String pin=generateRandomPin(6);
     static String telephone = generateEgyptianPhoneNumber();
static String email =generateDynamicEmail();
    @Test(priority = 1, description = "CreateNew customer accountValid Data")
    public void createNewCustomerAccount_P() {
        // TODO: Create new customer Account
        new P02_CreateNewCustomerpage(getDriver()).clickNewcustomerButton()
                .enternewCustomername(newcustomername)
                .enterDateofBirth(dateofBirth)
                .enter_Address(address)
                .enter_City(city)
                .enter_State(state)
                .enter_PIN(pin)
                .enter_Telephone(telephone)
                .enter_EMAIL(email)
                .clickSubmitButton()
                .back();
        // save customer id  and asssertions
    }
}
