package Inheritance;

public class Dog extends Animal{

    void bark(){
        System.out.println("Dogs bark");
    }

    public static void main(String args[]){

        Dog d1 = new Dog();
        d1.eat();
        d1.bark();
    }
}
