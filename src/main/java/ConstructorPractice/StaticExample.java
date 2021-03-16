package ConstructorPractice;

public class StaticExample{
    int num1;
    static int num2;

    public static void main(String[] args){

        num2=10;
        StaticExample ex1=new StaticExample();
        StaticExample ex2=new StaticExample();
        ex1.num1=20;
        num2=ex1.num1*5;//100
        ex1.num1=num2*2;//200
        ex1.num1=ex2.num2*2;//200
        ex1.num1=ex2.num1*2;//0
        System.out.println(ex1.num1);
        System.out.println(num2);
        System.out.println(ex1.num1);
    }
}
