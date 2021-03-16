package Primitives;

import java.util.Scanner;

public class BiggerToSmaller{
    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        System.out.println( "Please enter four number" );
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();
        int num4=input.nextInt();
        //int bigger;
        if (num1 > num2) {
            int bigger=num1;
            num1=num2;
            num2=bigger;
        }  if (num1 > num3) {
            int bigger=num1;
            num1=num3;
            num3=bigger;

        }  if (num1 > num4) {
            int bigger=num1;
            num1=num4;
            num4=bigger;

        }if (num2>num3){
            int bigger=num2;
            num2=num3;
            num3=bigger;
        }if (num2>num4){
            int bigger=num2;
            num2=num4;
            num4=bigger;
        }if (num3>num4){
            int bigger=num3;
            num3=num4;
            num4=bigger;
        }
        System.out.println(num4+"\n"+num3+"\n"+num2+"\n"+num1);
    }
}