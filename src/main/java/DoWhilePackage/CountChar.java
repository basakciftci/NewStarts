package DoWhilePackage;

import java.util.Scanner;

public class CountChar{
    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        System.out.println("Please enter the String Value");
        String value=input.next();
        System.out.println("Please enter the character which you want to count");
        String  ch=input.next();
        int count=0;
        int index=value.length()-1;
        while (index>=0){

            if (value.charAt(index)==ch.charAt( 0 )){
            count++;}
            index--;
        }
        System.out.println(count);
    }
}
