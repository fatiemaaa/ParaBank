package pages;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_LoginPage {

    WebDriver driver;
    public P02_LoginPage(WebDriver driver){
        this.driver=driver;
    }

    private final By USERNAME = By.xpath("//input[@name='username']");
    private final By PASSWORD = By.xpath("//input[@name='password']");
    private final By ClickOnLogin = By.xpath("//input[@value='Log In']");


    public P02_LoginPage enterUsername (String username){
        driver.findElement(this.USERNAME).sendKeys(username);
        return this;
    }
    public P02_LoginPage enterPassword (String password){
        driver.findElement(this.PASSWORD).sendKeys(password);
        return this;
    }

    public P02_LoginPage clickOnLoginBtn (String loginbtn){
        driver.findElement(this.ClickOnLogin).sendKeys(loginbtn);
        return this;
    }
}
