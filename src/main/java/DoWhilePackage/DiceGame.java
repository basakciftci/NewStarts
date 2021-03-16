package DoWhilePackage;

import java.util.Random;
import java.util.Scanner;

public class DiceGame{
    public static void main(String[] args) throws InterruptedException{
        Scanner input=new Scanner( System.in );
        Random random=new Random();
        int dice;
        int dice2;
        int sum;
        int count=0;
            System.out.println( "Do you want to play game" );
            String answer=input.next();
            if (answer.equalsIgnoreCase( "yes" )) {
                do {System.out.println( "Dice is rolling" );
                Thread.sleep( 1000 );
                    dice=random.nextInt( 7 );
                    dice2=random.nextInt( 7 );
                    if (dice==0){
                        dice++;}
                    if (dice2==0){
                        dice2++;}
                    sum=dice+dice2;
                    System.out.println("Dice 1 is "+dice);
                    System.out.println("Dice 2 is "+dice2);
                    System.out.println( "Your sum is " + sum );
                    count++;

                } while (sum != 2);
                System.out.println( "You win the game. Sum is 2." +"Your total count is "+count);

            } else {
                System.out.println( "Thank you. You can exit" );
            }
        }
    }