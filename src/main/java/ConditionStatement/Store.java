package ConditionStatement;

import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("How many table do you want to buy?");
        int table=input.nextInt();
        int priceTable=110;
        int discount;
        int totalPrice=priceTable*table;
        if (table>=10&& table<15){
            discount=(priceTable*table)*10/100;
            System.out.println("Your price is $"+(totalPrice-discount));
        }else if (table>=15&& table<20){
           discount=(priceTable*table)*20/100;
            System.out.println("Your price is $"+(totalPrice-discount));
        }else if (table>=20){
            discount=(priceTable*table)*25/100;
            System.out.println("Your price is $"+(totalPrice-discount));
        }else {
            System.out.println("Your price is $"+totalPrice);
        }

    }
}
