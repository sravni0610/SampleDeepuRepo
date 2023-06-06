package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1 {

    public static void main(String args[]){

        WebDriver driver;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

        driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        Login_page1 lp = new Login_page1(driver);
        Home_page  hp = new Home_page(driver);

        lp.username.sendKeys("admin");
        lp.password.sendKeys("admins");
        lp.login_btn.click();

        lp.login("admin","Admin");
        hp.PIM.click();
    }
}
