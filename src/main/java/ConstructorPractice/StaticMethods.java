package ConstructorPractice;

public class StaticMethods{
    public static void method1(){
        System.out.println("I am static method 1");
    }public void  method2(){
        System.out.println("I am non-static method 2");
        method1();
        method3();
        method4();
    }public static void method3(){
        System.out.println("I am static method 3");

    }
    public void method4(){
        System.out.println("I am non static method 4");
    }

    public static void main(String[] args){
        method1();
        method3();
        StaticMethods st=new StaticMethods();
        st.method2();
    }
}
