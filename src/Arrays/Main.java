package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Arrayss arr= new Arrayss();

        int []numbers={1,2,3,4,5};
        int result=arr.LinearSearch(numbers,8);

        if(result!=-1)
        System.out.println("Value found at index:"+result );

        else
            System.out.println("Value not found");





        //  numbers[2]=7;

      //  arr.input(numbers2);
        //arr.update(numbers,4,7);
        //arr.delete(numbers,4);
      //  arr.shiftLeft_Delete(numbers,2);

       // arr.R_Travesal(numbers);











       // System.out.println(Arrays.toString(numbers2));
       // System.out.println(Arrays.toString(numbers));






    }

}
