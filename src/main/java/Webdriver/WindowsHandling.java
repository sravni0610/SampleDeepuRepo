package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Iterator;
import java.util.Set;

public class WindowsHandling {

    public static void main(String args[]){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver wd = new ChromeDriver(options);
        wd.get("https://demo.guru99.com/popup.php");
        wd.manage().window().maximize();
        String parentwindow = wd.getWindowHandle();
        System.out.println(parentwindow);
        wd.findElement(By.linkText("Click Here")).click();
        Set<String> windows = wd.getWindowHandles();
        Iterator itr = windows.iterator();
        while (itr.hasNext()){

            String currentwindow = itr.next().toString();
            System.out.println(currentwindow);

            if(!currentwindow.equals(parentwindow)){
                wd.switchTo().window(currentwindow);
                wd.findElement(By.name("emailid")).sendKeys("sample@gmail.com");
            }
        }


    }
}
