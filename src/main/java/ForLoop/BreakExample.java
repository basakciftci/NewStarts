package ForLoop;

import java.util.Scanner;

public class BreakExample{
    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        System.out.println("Please enter the name");
        String name=input.next();
        for (int i=0;i<name.length();i++){

            if (name.charAt( i )=='a'||name.charAt( i )=='c'){
                break;
            }
            System.out.println(name.charAt( i ));
        }
    }
}
