package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Radiobtn {

    public static void  main(String args[]){

        String url = "https://www.calculator.net/mortgage-payoff-calculator.html";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver wd = new ChromeDriver(options);

        wd.get(url);
        wd.manage().window().maximize();
        wd.findElement(By.id("cloanamount")).clear();
        wd.findElement(By.id("cloanamount")).sendKeys("40000");
        wd.findElement(By.name("cloanterm")).clear();
        wd.findElement(By.name("cloanterm")).sendKeys("12");
        Boolean a = wd.findElement(By.id("cpayoff1")).isSelected();
        System.out.println(a);
        wd.findElement(By.xpath("//*[contains(text(),\"Payback altogether\")]")).click();





    }
}
