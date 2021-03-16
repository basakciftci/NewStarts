package ForLoop;

import java.util.Scanner;

public class YearInecrease{
    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        System.out.println("Please enter starts year");
        int year=input.nextInt();

        for (int i=year;i<year+3;i++){
            System.out.println(i);
            for (int k=1;k<=12;k++){
                System.out.println(k+". month");
            for (int day=1;day<=30;day++) {
                System.out.print( day+", " );
            }
                System.out.println();
            }
        }
    }
}
