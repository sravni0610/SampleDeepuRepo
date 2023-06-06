package sample;

public class Arrayex {

    public static void main(String args[]){


        int arr[] ;
        arr = new int[5];

        arr[0] = 100;
        arr[1] = 101;
        arr[2] = 102;
        arr[3] = 103;


        int a[] = {10,20,40,50,60,70};



        for(int i=0;i<arr.length;i++){

            System.out.println(arr[i]);
        }

        //for(datatype variable : array){  // }

        for(int i:arr) {
            System.out.println(i);
        }



        int ar[][]={{10,330,40,40},{83,04,88,474},{45,74,98,94},{48,9,47,49}};

        for (int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.println(ar[i][j]);
            }
        }


    }
}
