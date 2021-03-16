package ArithmeticOperators;

import java.util.Scanner;

public class Working2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter 3 different number");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();
        System.out.println(num1+" is the largest number: "+ (num1>num2 &&  num2>num3 || num1>num3 && num3>num2));
        System.out.println(num2+" is the largest number: "+(num2>num3 && num3>num1 || num2>num1 && num1>num3));
        System.out.println(num3+" is the largest number: "+(num3>num1 && num1>num2 || num3>num2 && num2>num1));
    }
}
