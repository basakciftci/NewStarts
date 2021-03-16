package ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample{
    public static void main(String[] args){
        Scanner input =new Scanner( System.in );
        int [] numbers=new int[7];
        for (int i=0;i<numbers.length;i++){
            System.out.println("Please enter "+(i+1)+". number");
            numbers[i]=input.nextInt();
        }
        System.out.println( Arrays.toString(numbers));
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]>20){
                System.out.println(numbers[i]);
            }
        }
    }
}
