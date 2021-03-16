package ForLoop;

import java.util.Scanner;

public class FirstPractice{
    public static void main(String[] args){
        for (int i=0;i<10;i++){
            System.out.println(i);
        }
        Scanner input=new Scanner( System.in );
        System.out.println("Please enter the value");
        String str=input.nextLine();
        for (int i=0;i<=str.length()-1;i++){
            System.out.println(str.charAt( i ));
        }
        System.out.println("============================");
        for (int i=str.length()-1;i>=0;i--){
            System.out.println(str.charAt( i ));
        }
        System.out.println("========================");
        String reversed="";
        for (int i=str.length()-1;i>=0;i--){
            reversed+=str.charAt( i );

        }
        System.out.println(reversed);
    }
}
