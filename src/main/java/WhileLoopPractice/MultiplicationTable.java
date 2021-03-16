package WhileLoopPractice;

import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        System.out.println("Please enter the number");
        int num=input.nextInt();
        int count=1;
        while(count<=10){
            int multiple=count*num;
            System.out.println(num+"x"+count+"="+multiple);
            count++;
        }
    }
}
