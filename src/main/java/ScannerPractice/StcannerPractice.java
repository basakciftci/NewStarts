package ScannerPractice;

import java.util.Scanner;

public class StcannerPractice {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in );
        System.out.println ( "What is your name?" );
        String name = input.next ( );
        System.out.println ( "Your name is "+name );
        System.out.println ("What is your date of birth" );
        int dateOfBirth=input.nextInt ();
        int currentYear=2021;
        int age=currentYear-dateOfBirth;
        System.out.println ("Your age is "+age );
        System.out.println ("What is your full name" );
        String namee=input.nextLine ();
        String nameFull=input.nextLine ();
        System.out.println ("Your full name is "+nameFull );
    }
}
