package sample;

public class Simpleif {

    public static void main(String args[]){

        int age = 19;
        int weight = 15;

        if(age>18){
            System.out.println("Person eligible to vote");
           if(weight > 50){
               System.out.println("Person eligible to donate blood");
           }
        }
        else {

            System.out.println("Person is not eligible to vote");

        }

        int marks = 101;

        if(marks < 40){
            System.out.println("Fail");
        } else if (marks >=40 && marks <50) {
            System.out.println("C Grade");
        } else if (marks >=50 && marks <60) {
            System.out.println("B Grade");
        } else if (marks>=60 && marks <75) {
            System.out.println("A Grade");
        } else if (marks>=75 && marks <100) {
            System.out.println("A+ Grade");
        }else {
            System.out.println("Invalid");
        }


    }
}
