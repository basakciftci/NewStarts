package EqualityPractice;

public class Coffee{
    public static void main(String[] args){
        Coffee coffee=new Coffee();
        Coffee coffee1=new Coffee();
        coffee=coffee1;
        coffee1=null;
        System.gc();
    }
}
