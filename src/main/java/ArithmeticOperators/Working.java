package ArithmeticOperators;

import java.util.Scanner;

public class Working {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the temperature ");
        double fahr=input.nextDouble();
        double degree=(fahr-32)*5/9;
        System.out.println(degree);
    }
}
