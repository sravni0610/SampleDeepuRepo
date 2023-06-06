package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Login_Prp {

    public static void main(String args[]) throws IOException {


        File f = new File("C:\\Users\\sravn\\OneDrive\\Desktop\\prp.txt");
        FileInputStream fis = new FileInputStream(f);

        Properties p = new Properties();
        p.load(fis);

        System.out.println(p.getProperty("userid"));
        System.out.println(p.getProperty("password"));



        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver wd = new ChromeDriver(options);

        wd.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
        wd.manage().window().maximize();


        wd.findElement(By.id("txtUsername")).sendKeys(p.getProperty("userid"));
        wd.findElement(By.id("txtPassword")).sendKeys(p.getProperty("password"));
        wd.findElement(By.id("btnLogin")).click();

    }
}
