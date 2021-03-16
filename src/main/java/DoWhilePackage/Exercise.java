package DoWhilePackage;

import java.util.Scanner;

public class Exercise{
    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        System.out.println("Please enter your value");
        String value=input.next();
        String newValue=value;
        do {
            newValue+="x";
        }while (newValue.length()!=20);
        System.out.println(newValue);
        System.out.println("=================================");
        while(value.length()<20){
            value+="*";

        }
        System.out.println(value);
    }

}
