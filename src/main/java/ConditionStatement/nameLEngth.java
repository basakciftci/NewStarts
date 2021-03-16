package ConditionStatement;

import java.util.Scanner;

public class nameLEngth {
    /* ask the user name then
    check the number of characters in name. if it less then 5 it will give message
    your name character is less than 5, else more than 5
     */
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Please write your name ");
        String name=input.next();
        System.out.println("Your name is "+name);
        System.out.println(name.length());
        if (name.length()<5){
            System.out.println("Your name character is less than 5");
        }else if(name.length()>5){
            System.out.println("Your name character is more than 5");
        }else{
            System.out.println("your name character is 5");
        }



    }
}
