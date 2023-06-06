package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Title_Check {

    public static void main(String args[]){



        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver wd = new ChromeDriver(options);

        wd.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
        wd.manage().window().maximize();

        String act_title = wd.getTitle();
        System.out.println(act_title);
        String  exp_title = "OrangeHR";

        if(act_title.equals(exp_title)){
            System.out.println("Titles matched and the application opened is valid");
        }

        else {
            System.err.println("Titles not matched application is invalid");
        }




        wd.close();


    }
}
