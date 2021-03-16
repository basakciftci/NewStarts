package String;

import java.util.Scanner;

public class Example2{
    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        System.out.println("Please enter your first name and last name" );
        String name=input.nextLine();
        char first=name.charAt( 0 );
        char last=name.charAt( name.indexOf( " " )+1 );
        System.out.println("first letter "+first+" last name first letter "+last);
        String actualFirst=""+first;
        String actualLast=""+last;

        String expFirst=actualFirst.toUpperCase();
        String expLast=actualLast.toUpperCase();
        System.out.println("First name starts with upper : "+actualFirst.equals( expFirst ));
        System.out.println("Last name starts with upper : "+actualLast.equals( expLast ));




    }
}
