package ArrayPractice;

import java.sql.Array;

public class FirstArray{
    public static void main(String[] args){
        int [] numbers=new int [4] ;
        numbers[0]=10;
        numbers [1]=35;
        numbers[2]=45;
        numbers[3]=30;
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[0]+numbers[2]);
        System.out.println(  );
        for (int i=0;i<numbers.length;i++){
            System.out.println((i+1)+" Number is "+numbers[i]);
        }



    }
}
