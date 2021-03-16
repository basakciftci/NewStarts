package DoWhilePackage;

import java.util.Scanner;

public class FactorialNum2{
    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        System.out.println("Please enter the number");
        int num=input.nextInt();
        int factorial=1;
        while(num>=1){
            factorial*=num;
            num--;
        }
        System.out.println(factorial);
    }
}
