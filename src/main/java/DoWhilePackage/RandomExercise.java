package DoWhilePackage;

import java.util.Random;
import java.util.Scanner;

public class RandomExercise{
    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        Random random=new Random();
        int randomNum=random.nextInt(101);;
        int guess;
        int count=0;
        System.out.println("Please enter your guess number ");
        do {
        guess=input.nextInt();
        if (guess<randomNum)
            System.out.println("It is too small");
        else if (guess>randomNum)
            System.out.println("It is too big");
        count++;
        }while(guess!=randomNum  );
        System.out.println("Your guess is true");
        System.out.println("Your total number of guess is "+count);
    }
}
