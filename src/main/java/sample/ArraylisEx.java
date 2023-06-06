package sample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylisEx

{
    public static void main(String args[]){

        ArrayList<String> al = new ArrayList<String>();

//        al.add("Ravi");
//        al.add("Vijay");
//        al.add("Ravi");
//        al.add("Ajay");


        Iterator itr = al.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
