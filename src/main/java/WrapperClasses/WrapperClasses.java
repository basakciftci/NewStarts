package WrapperClasses;

public class WrapperClasses{
    public static void main(String[] args){
        Integer num1=new Integer( "22" );
        int num1prm=num1;
        num1prm=num1prm+5;
        System.out.println(num1prm);
        Integer num2=Integer.valueOf( "101" );
        int num2prm=num2;//unboxing
        System.out.println(num2prm);

        int myNum=1;
        Integer myNumWrap=myNum;//Autoboxing

        Double db=Double.valueOf( "4.9" );
        double doblprm=db;
        System.out.println(db);
        Boolean b1=Boolean.valueOf( "FALSE" );
        System.out.println(b1);
        boolean b1prm=b1;
        System.out.println(b1);
        Byte byte1=Byte.valueOf( "12" );
        System.out.println(byte1);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println("=================");
        Integer number1=5;
        Integer number2=10;
        System.out.println(number1+number2);
        System.out.println(number1.equals( number2 ));

        int number3=Integer.parseInt("9");
        System.out.println(number3);
        double number4=Double.parseDouble( "3.5" );
        System.out.println(number4);
        // int number5=Double.parseDouble( "5.9" );  compile error
        double number6=Integer.sum( 5,9 );
        System.out.println(number6);
        int number7=Integer.max( 5,10 );
        System.out.println(number7);
        double number8=Integer.valueOf( "5" );
        System.out.println(number8);
        int reverse=Integer.reverse( 2147483647);
        System.out.println(reverse);
        int number9=Integer.min( 3,90 );
        System.out.println(number9);


    }
}
