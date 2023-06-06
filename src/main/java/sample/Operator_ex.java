package sample;

public class Operator_ex {

    public static void main(String args[]){

        int a = 10;
        int b = 15;

        int e = (a<b) ? a : b;

        boolean c = true;
        boolean d = false;


        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(b/a);

        System.out.println(a>b);

        System.out.println(c && d);
        System.out.println(c || d);
        System.out.println(!(c));

        System.out.println((a>b) && (b==5)); // false
        System.out.println((a<b) || (b==5)); //  True

        System.out.println(e);

        System.out.println((a>b)?"a is big":"a is small");





    }
}
