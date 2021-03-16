package Variables;

public class DataTypes {
 public static void main(String [] args){
     int studentNum=40;
     System.out.println(studentNum);;
     /*
     appleFreshMarket=1;
     appleWholeFoods=2;
     appleWalmart=3;
      */
     int appleFreshMarket=40;
     int appleWholeFoods=23;
     int appleWalmart=18;
     int sumApple=appleFreshMarket+appleWholeFoods+appleWalmart;
     System.out.println("This sum of apple number "+sumApple);
     int priceAppleFreshMarket=appleFreshMarket*2;
     int priceAppleWholeFoods=appleWholeFoods*2;
     int priceAppleWalmart=appleWalmart*3;
     int priceSum=priceAppleFreshMarket+priceAppleWalmart+priceAppleWholeFoods;
     System.out.println("This is price "+priceSum);
 }

}
