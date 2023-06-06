package sample;

public class Calc {

  void add(int a,int b){
      System.out.println(a+b);
  }

  void add(int a, int b, int c){
      System.out.println(a+b+c);
  }

  void add(double a,double b){
      System.out.println(a+b);
  }



    public static void main(String args[]){

        Calc c1 = new Calc();
        c1.add(10,34);
        c1.add(20.5,30);
        c1.add(10,20,20);


    }
}
