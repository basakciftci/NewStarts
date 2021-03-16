package ScannerPractice;

import java.util.Scanner;

public class BankAccount{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("PLease enter first money amount");
        int salary1=input.nextInt();//int amount=input.nextInt();
        System.out.println("please enter second amount");
        int salary2=input.nextInt();//amount+=input.nextInt;
        System.out.println("Please enter third amount");
        int salary3=input.nextInt();//amount+=input.nextInt();
        int totalS=salary1+salary2+salary3;
        System.out.println("Your total salary $"+totalS);
        System.out.println("How much paid the computer ");
        double comp=input.nextDouble();//float spending=input.nextFloat();
        System.out.println("How much paid phone ");
        double phone=input.nextDouble();//spending+=input.nextFloat();
        double spentM=comp+phone;
        System.out.println("You spend $"+spentM);
        double moneyAc=totalS-spentM;//amount-=spending
        System.out.println("Your bank account has $"+moneyAc);
    }
}
