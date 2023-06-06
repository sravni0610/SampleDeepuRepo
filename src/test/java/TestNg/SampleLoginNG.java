package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleLoginNG {

    WebDriver driver;

    @BeforeMethod

    public void before(){

        System.out.println("Executes before test");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }


    @Test
    public void logintest(){
        driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.id("txtUsername")).sendKeys("admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
        driver.findElement(By.id("btnLogin")).click();

        String exp_title = "OrangeHRM";
        String act_title = driver.getTitle();

        if(exp_title.equals(act_title)){
            System.out.println("Titles MAtched");
        }

        else {
            System.out.println("Titles not matched");

        }

    }

    @AfterMethod
    public void after(){
        System.out.println("Executes after test");
        driver.close();

    }

}
