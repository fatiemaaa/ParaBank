package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_RegisterPage {

    WebDriver driver;
    public P01_RegisterPage(WebDriver driver){
        this.driver=driver;
    }

    private final By First_Name= By.xpath("//input[@id='customer.firstName']");
    private final By Last_Name= By.xpath("//input[@id='customer.lastName']");
    private final By Address_Name= By.xpath("//input[@id='customer.address.street']");
    private final By City_Name= By.xpath("//input[@id='customer.address.city']");
    private final By State_Name= By.xpath("//input[@id='customer.address.state']");
    private final By Postal_Code= By.xpath("//input[@id='customer.address.zipCode']");
    private final By Phone_Number=By.xpath("//input[@id='customer.phoneNumber']");
    private final By SSN_Number= By.xpath("//input[@id='customer.ssn']");
    private final By UserName= By.xpath("//input[@id='customer.username']");
    private final By Password= By.xpath("//input[@id='customer.password']");
    private final By ConfirmPassword= By.xpath("//input[@id='customer.password']");
    private final By Click_On_Register= By.xpath("//input[@value='Register']");


    public P01_RegisterPage enterfirstname(String firstname){
        driver.findElement(this.First_Name).sendKeys(firstname);
        return this;
    }
    public P01_RegisterPage enterlastname(String lastname){
        driver.findElement(this.Last_Name).sendKeys(lastname);
        return this;
    }

    public P01_RegisterPage enterAddressname(String addressname){
        driver.findElement(this.Address_Name).sendKeys(addressname);
        return this;
    }

    public P01_RegisterPage enterCityname(String cityname){
        driver.findElement(this.City_Name).sendKeys(cityname);
        return this;
    }

    public P01_RegisterPage enterStatename(String statename){
        driver.findElement(this.State_Name).sendKeys(statename);
        return this;
    }

    public P01_RegisterPage enterPostalcode(String postalcode){
        driver.findElement(this.Postal_Code).sendKeys(postalcode);
        return this;
    }
    public P01_RegisterPage enterPhonenumber(String phonenumber){
        driver.findElement(this.Phone_Number).sendKeys(phonenumber);
        return this;
    }
    public P01_RegisterPage enterSSNnumber(String ssnnumber){
        driver.findElement(this.SSN_Number).sendKeys(ssnnumber);
        return this;
    }
    public P01_RegisterPage enterUsername(String username){
        driver.findElement(this.UserName).sendKeys(username);
        return this;
    }
    public P01_RegisterPage enterPasswrord(String password){
        driver.findElement(this.Password).sendKeys(password);
        return this;
    }

    public P01_RegisterPage enterConfirmpassword(String confirmpassword){
        driver.findElement(this.ConfirmPassword).sendKeys(confirmpassword);
        return this;
    }
    public P01_RegisterPage ClickOnRegisterBtn(String registerbtn){
        driver.findElement(this.Click_On_Register).sendKeys(registerbtn);
        return this;
    }




}




