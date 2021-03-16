package DoWhilePackage;

import java.util.Scanner;

public class ReversedString{
    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        System.out.println("Please enter String value for reverse");
        String value=input.next();
        String reversed="";
        int index=value.length()-1;
        while(index>=0){
            reversed+=""+value.charAt( index );
            index--;
        }
        System.out.println(reversed);



    }
}
