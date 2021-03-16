package DoWhilePackage;

import java.util.Scanner;

public class PerfectNumber{
    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        System.out.println("Please enter the number");
        int num=input.nextInt();
        int divident=1;
        int sum=0;
        do {
            if (num%divident==0){
                sum+=divident;
            }divident++;
        }while (divident<num);
        if (sum==num){
            System.out.println("This is perfect number");
        }else {
            System.out.println("This is not perfect number");
        }
    }
}
