package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sampletest {

    public static void main(String args[]){


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver wd = new ChromeDriver(options);
        wd.get("https://demoqa.com/");
        wd.manage().window().maximize();
        wd.findElement(By.xpath("//h5[contains(text(),'Elements')]")).click();
    }
}
