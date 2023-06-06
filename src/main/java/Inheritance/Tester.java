package Inheritance;

public class Tester extends  Employee{

    int bonus = 5000;
    public static void main(String args[])
    {
        Tester t1 = new Tester();
        System.out.println(t1.salary);
        System.out.println(t1.bonus);
    }
}
