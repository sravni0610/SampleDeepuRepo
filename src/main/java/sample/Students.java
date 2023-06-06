package sample;

public class Students {

    int id;
    String name;

    static String clgname = "WER";

    void display(){

        System.out.println("Id of the object is "+id);
        System.out.println("Name of the object is "+name);
        System.out.println("Clgname of the object is "+clgname);

    }

    void insert(int i, String n){

        id = i;
        name = n;

    }

    void insert1(int id, String name){
        this.id = id;
        this.name = name;
    }

    Students(){

    }

    Students(int i,String n){
        id = i;
        name = n;
    }


    public static void main(String args[]){

        Students  s1 = new Students();

        System.out.println("Id of the object is "+s1.id);
        System.out.println("Name of the object is "+s1.name);

        s1.id = 101;
        s1.name = "Deepu";

       s1.display();

       Students s2 = new Students(102,"abc");
       //s2.insert(102,"abc");
       s2.display();

       Students s3 = new Students();
       s3.insert1(103,"DFG");
       s3.display();

    }

}
