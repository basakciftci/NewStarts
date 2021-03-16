package ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAssignment{
    public static void main(String[] args){
        int [] nums;
        nums=new int[]{4,5,6,7};
        int [] numbers=nums;
        System.out.println( Arrays.toString(numbers));
        System.out.println("=============");
        Scanner input=new Scanner( System.in );
        System.out.println("Please enter the values");
        String names;
        String [] str=new String[6];
        for (int i=0;i<6;i++){
            System.out.println("Please enter "+(i+1)+". name");
            names=input.next();
            str[i]=names;
        }
        System.out.println(Arrays.toString( str ));
//        System.out.println("=====================");
//        System.out.println("Please enter the values");
//        String [] name=new String[6];
//        for (int i=0;i<name.length;i++){
//            System.out.println("Please enter "+(i+1)+". name");
//            name[i]=input.next();
//        }
//        System.out.println(Arrays.toString( name ));

    }
}
