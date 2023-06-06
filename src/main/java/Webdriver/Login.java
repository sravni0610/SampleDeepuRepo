package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login {

    public static void main(String args[]){


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver wd = new ChromeDriver(options);

        wd.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
        wd.manage().window().maximize();

        wd.findElement(By.id("txtUsername")).sendKeys("admin");
        wd.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
        wd.findElement(By.id("btnLogin")).click();


    }
}
