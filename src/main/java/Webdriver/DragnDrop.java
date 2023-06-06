package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {
    public static void main(String args[]){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver wd = new ChromeDriver(options);
        wd.get("https://jqueryui.com/");
        wd.manage().window().maximize();
        wd.findElement(By.linkText("Droppable")).click();
        wd.switchTo().frame(0);
        WebElement drag=wd.findElement(By.id("draggable"));
        WebElement drop=wd.findElement(By.id("droppable"));

        Actions dandD = new Actions(wd);
        dandD.dragAndDrop(drag,drop).build().perform();



    }
}
