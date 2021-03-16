package ArithmeticOperators;


import java.util.Scanner;

public class Examplee {
    public static void main(String[] args) {
        //enter a number that is even and less than 100
        Scanner input=new Scanner(System.in);
        System.out.println("please enter number which is even and less than 100");
        int number = input.nextInt();
        boolean result=number%2==0 && number<100;
        System.out.println("Your number is "+result);


    }
}
