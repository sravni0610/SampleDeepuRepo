package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class StaticWebtable {

    public static void main(String argss[]) {


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver wd = new ChromeDriver(options);
        wd.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
        wd.manage().window().maximize();
        wd.findElement(By.id("txtUsername")).sendKeys("admin");
        wd.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
        wd.findElement(By.id("btnLogin")).click();
        WebElement pim = wd.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']"));
        Actions action = new Actions(wd);
        action.moveToElement(pim).build().perform();
        wd.findElement(By.id("menu_pim_viewEmployeeList")).click();
        WebElement table = wd.findElement(By.id("resultTable"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        for(int i=0;i<rows.size();i++){
            List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
            for(int j=0;j<cols.size();j++){
                System.out.println(cols.get(j).getText());
            }
        }



    }
}
