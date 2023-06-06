package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page1 {

    WebDriver driver;

    @FindBy(id = "txtUsername")
    WebElement username;

    @FindBy(id = "txtPassword")
    WebElement password;

    @FindBy(id = "btnLogin")
    WebElement login_btn;

    @FindBy(linkText = "Forgot your password?")
    WebElement forgotpwd;



    public void login(String id, String pwd){

        username.sendKeys(id);
        password.sendKeys(pwd);
        login_btn.click();
    }




    public Login_page1(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
