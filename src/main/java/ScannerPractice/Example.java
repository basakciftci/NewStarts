package ScannerPractice;

import java.util.Scanner;

public class Example{
    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        System.out.println("please enter 3 different number");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();

        if (num1==num2 && num2==num3){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        boolean result=num1==num2 &&num2==num3;
        System.out.println(result);

    }
}
