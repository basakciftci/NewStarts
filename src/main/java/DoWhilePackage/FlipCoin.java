package DoWhilePackage;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin{
    public static void main(String[] args){
        Scanner input= new Scanner( System.in );
        Random random=new Random();
       // System.out.println(random.nextInt(100));
        int randomNumber=random.nextInt(2);
        String answer;
        do {
            String flipped=randomNumber==0?"Heads":"Tails";
            System.out.println("Coin is flipping now");
            System.out.println("Please enter your guess");
            String guess=input.next();
            System.out.println("Actual result was "+flipped);
            if(guess.equalsIgnoreCase( flipped )){
                System.out.println("You are lucky today, You WIN the game");
            }else {
                System.out.println( "You are such a loser" );
            }
            System.out.println("Do you want to play again ? y/n");
           answer=input.next();
        }while (answer.equalsIgnoreCase( "y" ));
        System.out.println("IT was pleasure to play with you. Have a great day");



    }
}
