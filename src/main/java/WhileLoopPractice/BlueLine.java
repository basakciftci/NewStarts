package WhileLoopPractice;

import java.util.Scanner;

public class BlueLine{
    public static void main(String[] args){
        int deposit=30;
        int usage=2;
        int count=0;
        while ( deposit>=usage ){
            count++;
            deposit-=usage;
            //System.out.println(deposit);
        }
        System.out.println(count);

        Scanner input=new Scanner( System.in );
        System.out.println("Please enter 800 for phone");
        int phone=input.nextInt();
        int amount=800;
       while (phone<amount){
           System.out.println("Please enter the rest of amount "+(amount-phone));
            int rest=input.nextInt();
            phone+=rest;
       }
        System.out.println("You can buy phone");
    }
}
