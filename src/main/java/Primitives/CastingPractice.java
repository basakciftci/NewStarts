package Primitives;

public class CastingPractice {
    public static void main(String[] args) {
        byte num=7;
        short num2=30;

        short result=(short) (num*num2);
        System.out.println("result is "+result);

        int number=(int)(4.7);
        System.out.println(number);

        byte k=(byte)5f;
        System.out.println(k);

        short c=6;
        short t=8;
        c+=t;
        System.out.println(c);
    }
}
