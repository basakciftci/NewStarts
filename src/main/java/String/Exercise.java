package String;

import java.util.Scanner;

public class Exercise{
    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        System.out.println("Please enter  2 date with following format mm/dd/yyyy");
        String date=input.nextLine();
        System.out.println("Please enter  2 date with following format mm-dd-yyyy");
        String date2=input.nextLine();
        date=date.replace( '/','-' );
        System.out.println("two date is equals "+date.equals( date2 ));
    }
}
