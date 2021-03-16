package String;

import java.util.Scanner;

public class PlanetName{
    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        System.out.println( "Please enter the Planet name" );
        String planet=input.next();
        System.out.println( "First char " + planet.charAt( 0 ) );
        System.out.println("LAst char "+planet.charAt(  planet.length()-1));
        System.out.println("Middle char "+planet.charAt( (planet.length()-1)/2 ));
        System.out.println("Index of first 'k' "+planet.indexOf( 'k' ));
        System.out.println("Index of second 'k' "+planet.indexOf( 'k',planet.indexOf( 'k' )+1 ));
       // System.out.println("Char 10th "+planet.charAt( 10 ));

    }
}
