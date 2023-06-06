package TestNg;

import org.testng.annotations.Test;

public class BasicTest {

@Test(priority = 2)
public void A(){

    System.out.println("Sample Testing 1st method");

}

@Test(priority = 1)
    public void b(){
    System.out.println("Sample Testing 2nd method");
}


@Test(priority = 0)
    public void a(){
        System.out.println("Sample Testing 3rd method");
    }

}
