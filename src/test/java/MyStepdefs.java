import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyStepdefs {


    WebDriver driver;

    @Before
    public void start(){

        driver = TestRunner.driver;

    }


    @Given("User navigates to the application page")
    public void userNavigatesToTheApplicationPage() {

        String exp_title = "OrangeHRM";
        String act_title = driver.getTitle();
        Assert.assertEquals(exp_title,act_title);

    }

    @When("User provides login details")
    public void userProvidesLoginDetails() {

        driver.findElement(By.id("txtUsername")).sendKeys("admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");



    }

    @And("User clicks on login")
    public void userClicksOnLogin() {

        driver.findElement(By.id("btnLogin")).click();

    }

    @Then("User navigated to the Dashboard page")
    public void userNavigatedToTheDashboardPage() {

        String exp_title = "OrangeHRM";
        String act_title = driver.getTitle();
        Assert.assertEquals(exp_title,act_title);
    }

    @When("User provides login details {string},{string}")
    public void userProvidesLoginDetails(String id, String pwd) {

        driver.findElement(By.id("txtUsername")).sendKeys(id);
        driver.findElement(By.id("txtPassword")).sendKeys(pwd);

    }
}
