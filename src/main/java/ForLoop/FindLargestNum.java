package ForLoop;

import java.util.Scanner;

public class FindLargestNum{
    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        System.out.println("Please enter the number ");
        int num=input.nextInt();
        System.out.println("Please start entering the number");
        int firstNum=input.nextInt();
       int second=0;
        for (int i=0;i<num-1;i++){
            second=input.nextInt();
            if (firstNum<second){
                firstNum=second;
            }
        }
        System.out.println(second);
    }
}
