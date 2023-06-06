package Webdriver;

public class Exceptionsample {


    public static void validate(int age){
        if(age <18){

            throw new ArithmeticException("Person is not eligible to vote");
        }

        else {
            System.out.println("Person is eligible to vote");
        }
    }

    public static void main(String args[]){

        validate(13);

       try {

           int a[] = new int[4];

           a[0] = 10;
           a[1] = 20;
           a[2] = 30;
           a[3] = 40;
          // a[4] = 50;


           for (int i : a) {
               System.out.println(i);
           }

       }

       catch (Exception e){
           System.out.println(e);
       }

        finally {
           System.out.println("Executes at all point of time");
       }

    }


}
