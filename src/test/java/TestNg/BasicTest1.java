package TestNg;

import org.testng.annotations.*;

public class BasicTest1 {


    @Test
    public void testcase(){
        System.out.println("Test Execution");
    }


    @BeforeMethod

    public void beforemethod(){
        System.out.println("Before the test method");
    }

    @AfterMethod

    public void aftermethod(){
        System.out.println("After Method");
    }

    @BeforeClass

    public void beforeclass(){
        System.out.println("Before class");
    }

    @AfterClass

    public void afterclass(){
        System.out.println("After class");
    }


    @BeforeTest

    public void beforetest(){
        System.out.println("Before Test");
    }

    @AfterTest

    public void aftertest(){
        System.out.println("After Test");
    }

    @BeforeSuite

    public void beforesuite(){
        System.out.println("Before suite");
    }

    @AfterSuite

    public void aftersuite(){
        System.out.println("After suite");
    }



}
