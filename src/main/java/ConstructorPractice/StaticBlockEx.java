package ConstructorPractice;

public class StaticBlockEx{
    static {
        System.out.println("I am static block");
    }
    //instance block
    {
        System.out.println("I am instance block");
    }
    public StaticBlockEx(){
        System.out.println("I am in constructor");
    }

    public static void main(String[] args){
        StaticBlockEx sbEx=new StaticBlockEx();
        StaticBlockEx sbEx1=new StaticBlockEx();
        StaticBlockEx sbEx2=new StaticBlockEx();
    }
}
