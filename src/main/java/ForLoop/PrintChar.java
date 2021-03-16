package ForLoop;

import java.util.Scanner;

public class PrintChar{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in );
        System.out.println("Please enter the value");
        String str=input.nextLine();

        for (int i=0;i<str.length();i++){
            if (str.charAt( i)=='a'|| str.charAt( i )=='A'){
                System.out.println(str.charAt( i ));
            }
        }
    }
}
