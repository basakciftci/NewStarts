package AccessModifiers;

public class PassByValue{
   static int carNumber=10;
   static int carNumbr=4;

    public static void updateNum(int carNumbr){
        System.out.println( carNumbr);
        carNumbr=5;
        System.out.println(carNumbr);
    }

    public static void main(String[] args){
        updateNum(carNumbr);
        System.out.println(carNumbr);
    }
}
