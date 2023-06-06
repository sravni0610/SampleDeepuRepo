package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {


    WebDriver driver;

    @FindBy(id="menu_pim_viewPimModule")
    WebElement PIM;



    public Home_page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
