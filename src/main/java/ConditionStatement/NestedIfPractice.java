package ConditionStatement;

import java.util.Scanner;

public class NestedIfPractice{
    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        System.out.println("Do you know java");
        String java=input.next();
        if (java.equalsIgnoreCase( "yes" )){
            System.out.println("Do you know Selenium ");
            String selenium=input.next();
            if (selenium.equalsIgnoreCase( "yes" )){
                System.out.println("Do you know api testing");
                String api=input.next();
                if (api.equalsIgnoreCase( "yes")){
                    System.out.println("Congragulation You hired");
                }else if (api.equalsIgnoreCase( "no" )){
                    System.out.println("You need to learn api testing");
                }
            }else if (selenium.equalsIgnoreCase( "no" )){
                System.out.println("You need to learn Selenium");
            }
        }else if (java.equalsIgnoreCase( "no" )){
            System.out.println("We need a person who knows java");
        }else{
            System.out.println("PLease enter valid answer");
        }
    }
}
