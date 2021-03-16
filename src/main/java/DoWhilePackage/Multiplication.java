package DoWhilePackage;

import java.util.Scanner;

public class Multiplication{
    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        System.out.println("Please enter the number");
        int num=input.nextInt();
        int count=1;
        int multiple;
        int sum=0;
        do {
           multiple =count*num;
            System.out.println(num+"x"+count+"="+multiple);
            count++;
            sum+=multiple;
        }
        while(count<=10);
        System.out.println("Sum of multiplication "+sum);



        }
    }

