package ArithmeticOperators;

import java.util.Scanner;

public class ConditionExapmle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number");
        int month=input.nextInt();
        if (month==1){
            System.out.println("This in January it has 31 day");
        }else if (month==2){
            System.out.println("This is February it has 28 day");
        }else if(month==3){
            System.out.println("This is march it has 31 days");
        }else {
            System.out.println("wrong month");
        }
    }
}
