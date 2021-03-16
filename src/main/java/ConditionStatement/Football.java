package ConditionStatement;

import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("What is your jersey number ");
        int number= input.nextInt();
         if(number<=0) {
             System.out.println("invalid number");
         }else if (number%2==0){
            System.out.println("Your number is even");
        }else if(number%2==1){
            System.out.println("Your number is odd");
        }
    }
}
