package ForLoop;

import java.util.Scanner;

public class CarGas{
    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        System.out.println("How many miles did you drive");
        int mil=input.nextInt();
        for (int i=0;i<mil;i+=2000){
                System.out.println("Change the oil");
            for (int k=0;k<2000;k+=500){
                    System.out.println("Fill the gas");
            }
        }
    }
}
