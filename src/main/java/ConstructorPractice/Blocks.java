package ConstructorPractice;

public class Blocks{
    public Blocks(){
        System.out.println(1);
    }
    {
        System.out.println(2);
    }
    static {
        System.out.println(3);
    }
    static {
        System.out.println(4);
    }
    {
        System.out.println(5);
    }


}
