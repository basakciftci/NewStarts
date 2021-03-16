package ConditionStatement;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {


        int apples = 15;
        int banana = 21;
        if (banana>apples) {
            System.out.println("We have more bananas than apples ");
        }else {
            System.out.println("We have more apples than bananas");
        }
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=input.nextInt();
        if (age>=18){
            System.out.println("You can vote");
        }else{
            System.out.println("You can not vote");
        }
    }
}