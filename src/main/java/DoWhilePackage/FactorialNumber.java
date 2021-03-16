package DoWhilePackage;

import java.util.Scanner;

public class FactorialNumber{
    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        System.out.println("Please enter the number");
        int num=input.nextInt();
        int factorial=1;
        int multiple=1;
        while(num>multiple){
             factorial*=multiple*num;
           // System.out.println(factorial);
            num--;
        }
        System.out.println(factorial);
        System.out.println("========================");
        System.out.println("Please enter the number for do while loop");
        int num1=input.nextInt();
        int factorial1=1;
        do {
            factorial*=num;
            num--;
        }while (1<num);
        System.out.println(factorial);


    }
}
