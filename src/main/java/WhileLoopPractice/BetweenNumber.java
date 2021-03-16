package WhileLoopPractice;

import java.util.Scanner;

public class BetweenNumber{
    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        System.out.println("Please enter starting number");
        int start=input.nextInt();
        System.out.println("Please enter ending number");
        int end=input.nextInt();
        while (start<=end){
            if (start%2==1){
                System.out.println(start);
            }

            start++;
        }
    }
}
