package Primitives;

public class Farm {
    public static void main(String[] args) {
        int cow=50;
        int chicken=110;
        int sumAnm=cow+chicken;
        System.out.println("Total animal number= "+sumAnm);
        int cowLeg=cow*4;
        int chickLeg=chicken*2;
        int sumLeg=cowLeg+chickLeg;
        System.out.println("Total leg is = "+sumLeg);
        int pCow=cow*2000;
        int pChicken=chicken*55;
        int sumPrice=pChicken+pCow;
        System.out.println("Total price = $"+sumPrice);
    }
}
