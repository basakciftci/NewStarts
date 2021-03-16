package Primitives;

public class UnaryOperators {
    public static void main(String[] args) {
        int appleNumber=30;
        appleNumber++;
        System.out.println(appleNumber);
        appleNumber--;
        System.out.println(appleNumber);


        int sNumber=13;
        int totalSNumber=sNumber++%5*++sNumber-sNumber--/2;
        System.out.println(sNumber);
        System.out.println(totalSNumber);

    }
}
