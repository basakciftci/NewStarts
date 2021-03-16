package ConstructorPractice;

public class Calculator{
    public static  int sum(int num1 , int num2){
        return num1+num2;
    }
    public static int subtract(int num1,int num2){
        return num1-num2;
    }
    public static int multiply(int num1, int num2){
        return num1*num2;
    }public static int division(int num1,int num2){
        return num1/num2;
    }
    public static int calc(int num1, int num2, String operator){
        if (operator.equals( "*" )){
            return multiply(num1, num2 );
        }else if (operator.equals( "+" )){
            return sum( num1,num2 );
        }else if (operator.equals( "-" )){
            return  subtract( num1,num2 );
        }else if (operator.equals( "/" )){
            return division( num1,num2 );
        }else{
            System.out.println("Invalid operator");
            return 0;
        }
    }
}
