package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class DynamicWebTable {

    public static void main(String args[]){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver wd = new ChromeDriver(options);
        wd.get("https://www.esky.co.uk/");
        wd.manage().window().maximize();
        wd.findElement(By.id("TripTypeOneway")).click();
        wd.findElement(By.id("departureOneway")).sendKeys("London");
        wd.findElement(By.id("arrivalOneway")).sendKeys("Delhi");

        String doj = "30/05/2024";

        wd.findElement(By.id("departureDateOneway")).click();

        String a[] = doj.split("/");
        String day = a[0];
        String year = a[2];
        int x = Integer.parseInt(a[1]);

        String mons[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};

        String mon = mons[x-1];
        String calyear = wd.findElement(By.className("ui-datepicker-year")).getText();

        while(!calyear.equals(year)){
            wd.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
            calyear = wd.findElement(By.className("ui-datepicker-year")).getText();
            System.out.println(calyear);
        }

        String calmon = wd.findElement(By.className("ui-datepicker-month")).getText();

        while (!calmon.equals(mon)){
            wd.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
            calmon = wd.findElement(By.className("ui-datepicker-month")).getText();
            System.out.println(calmon);
        }

        WebElement table = wd.findElement(By.className("ui-datepicker-calendar"));

        List<WebElement> rows = table.findElements(By.tagName("tr"));

        for(int i=0;i<rows.size();i++){
            List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));

            for(int j=0;j<cols.size();j++){
                if(cols.get(j).getText().equals(day)){
                    cols.get(j).click();
                }
            }
        }



    }
}
