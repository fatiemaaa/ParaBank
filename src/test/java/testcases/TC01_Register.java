package testcases;
import org.testng.annotations.Test;
import pages.P01_RegisterPage;

import  static util.Utility.*;

public class TC01_Register extends TestBase{

    static String firstname = generateRandomFirstName();
    static String lastname= generateRandomLastName();




    @Test(priority = 1 , description = "Validate That The Customer can Register successfully")
    public void ValidateThatTheCustomerCanRegisterSuccessfuly(){
        new P01_RegisterPage(driver).enterfirstname().enterlastname().enterAddressname().enterCityname()
                .enterStatename().enterPostalcode().enterPhonenumber().enterSSNnumber().enterPasswrord()
                .enterConfirmpassword().ClickOnRegisterBtn();
    }
}
