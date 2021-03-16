package ForLoop;

import java.util.Scanner;

public class Example{
    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        System.out.println("Please enter the number");
        int num=input.nextInt();
        int productNum=1;
        int sum=0;
        for (int i=num;i>0;i/=10){

            int digit=i%10;
            productNum*=digit;
            sum+=digit;

        }
        System.out.println("Sum"+sum);
        System.out.println(productNum-sum );


        //make with while loop
    }
}
