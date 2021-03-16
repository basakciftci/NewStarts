package WhileLoopPractice;

import java.util.Scanner;

public class StarTree{
    public static void main(String[] args){
        Scanner input =new Scanner( System.in );
        System.out.println("Please enter the number");
        int num=input.nextInt();
        int count=0;
        String star="*";
        while (count<num){
            System.out.println(star);
            star+="*";
            count++;
        }
    }
}
