package ConstructorPractice;

public class TestCalculate{
    public static void main(String[] args){
        System.out.println(Calculator.sum( 4,5 ));
        System.out.println(Calculator.multiply( 2,10 ));
        System.out.println(Calculator.subtract( 90,19 ));

        System.out.println(Calculator.calc( 3,8,"*" ));
        System.out.println(Calculator.calc( 5,5,"!" ));

    }
}
