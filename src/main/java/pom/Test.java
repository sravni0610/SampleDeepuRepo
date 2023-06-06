package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {

    private static WebDriver driver;

    public static void main(String args[]){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
       driver = new ChromeDriver(options);

        driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        Login_page.username(driver).sendKeys("admin");
        Login_page.password(driver).sendKeys("admins");
        Login_page.login_btn(driver).click();


    }
}
