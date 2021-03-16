package String;

import java.util.Scanner;

public class SubstringPractice{
    public static void main(String[] args){
        String comComponent="keyboard";
        System.out.println(comComponent.substring( 3 ));
        System.out.println(comComponent.substring( 3,5 ));
        System.out.println(comComponent.substring( 2,2 ));//empty
       // System.out.println(comComponent.substring( 4,2 ));//it will give error. it has to be bigger first index
       // System.out.println(comComponent.substring( 4,20 ));//it will give error, it does not have 20 character
        Scanner input=new Scanner( System.in );
        System.out.println("Please enter name and year  ");
        String nameDate=input.nextLine();
        System.out.println("first letter is m"+nameDate.startsWith( "m" ));
        boolean nameTrue=nameDate.contains( "muammer" );
        System.out.println("Contains muammer "+nameTrue);
        System.out.println("Year is "+nameDate.substring( nameDate.length()-4 ));
        boolean dateTrue=nameDate.substring( nameDate.length()-4  ).equals("1995");
        System.out.println("Year is 1995 "+dateTrue);

        String name="name";
        System.out.println(name.replace( "me","zli" ));
        String exception="indexOutOfBoundException";
        System.out.println(exception.replace( 'e','a' ));
    }
}
