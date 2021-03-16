package String;

import java.util.Scanner;

public class MethodChaining{
    public static void main(String[] args){
        String str=" Zero to Hero ";
        str=str.replace( "Zero","One" ).toUpperCase().trim().substring( 0,3 );
        System.out.println("value of str is "+str);
        String name=" Applications ";
        int index=name.toLowerCase().trim().indexOf( "t" );
        System.out.println(index);

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter number  this format: n.n% of n.n%");
        String num1=input.nextLine();
        System.out.println("Please enter number two");
        String num2=input.nextLine();
        num1=num1.replace( "%","" ).replace( " of ","-" );
        System.out.println(num1.equals( num2 ));
    }
}
