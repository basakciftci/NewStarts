package Primitives;

public class Coins {
    public static void main(String[] args) {
        /*
        how many quarters dimes nickels, pennies
        quarter==25; dimes==10; nickels=5; pennies=1
         */

        int value=98;
        int quarters=value/25;
        int quarterRemain=value%25;
        int dimes=quarterRemain/10;
        int dimesRemain=quarterRemain%10;
        int nickels=dimesRemain/5;
        int nickelRemain=dimesRemain%5;
        int pennes=nickelRemain/1;
        int pennesReamin=nickelRemain%1;
    }
}
