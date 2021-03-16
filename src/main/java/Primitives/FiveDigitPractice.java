package Primitives;

import java.util.Scanner;

public class FiveDigitPractice{
    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        System.out.println("please enter the number");
        int num=input.nextInt();//56789
        int first=num%10;//9
        num=num/10;//5678
        int second=num%10;//8
        num=num/10;//567
        int third=num%10;//7
        num=num/10;//56
        int forth=num%10;//6
        num=num/10;//5
        int fifth=num%10;//5
        num=num/10;//5
        String reversed=""+first+second+third+forth+fifth;
        System.out.println(reversed);
        System.out.println(""+first+"\n"+second+"\n"+third+"\n"+forth+"\n"+fifth);
        int sum=first+second+third+forth+fifth;
    }
}
