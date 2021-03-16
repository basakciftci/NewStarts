package ForLoop;

import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        System.out.println("Please enter first number between 1-100");
        int num1=input.nextInt();
        System.out.println("Please enter second number between 1-100");
        int num2=input.nextInt();

        for (int i=num1;i<=num2;i++){
            int result=0;
            for (int k=2;k<i;k++){
                if (i%k==0){
                    result+=k;
                }
            }if (result==0){
                System.out.println("i is prime number "+i);
            }
        }
    }
}
