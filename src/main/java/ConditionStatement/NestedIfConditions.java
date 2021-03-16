package ConditionStatement;

import java.util.Scanner;

public class NestedIfConditions{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Do you have a Bachelor Degree");
        String bachelor=input.next();
        if (bachelor.equalsIgnoreCase( "yes" )){
            System.out.println("What is your gpa score");
            double gpa=input.nextDouble();
            if (gpa>=3){
                System.out.println("You accepted to the University");
            }else {
                System.out.println("You need to increase gpa score");
            }

        }else if (bachelor.equalsIgnoreCase( "no" )){
            System.out.println("You need bachelor Degree");
        }else {
            System.out.println("Your input is incorrect");
        }
    }
}
