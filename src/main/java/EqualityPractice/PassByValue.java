package EqualityPractice;

public class PassByValue{
    public static void updateNum(int num){
        num=10;
    }
    public static void main(String[] args){
//        System.out.println();
//       int num=5;
//       updateNum(num);
//        System.out.println(num);
//        double number=6.4;
//        number=updateDouble(number);
//        System.out.println(number);
        //System.out.println(updateDouble(125));
        double bl=6.4;
        System.out.println(updateDouble(bl));
        bl=updateDouble(bl);
        System.out.println(bl);
    }
    public static double updateDouble(double bl){

        bl=bl*10%5;

        return  bl;

    }

}
