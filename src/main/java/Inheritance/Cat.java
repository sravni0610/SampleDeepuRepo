package Inheritance;

public class Cat extends Animal{

    void drink(){
        System.out.println("Cats like to drink milk");
    }

    public static void main(String args[]){

        Cat c1 = new Cat();
        c1.eat();
        c1.drink();
    }
}
