package ArrayPractice;

public class GroceryPriceInvent{
    public static void main(String[] args){
        String [][] grocery={{"Watermelon","Apple","Banana"},
                {"Beans","Lettuce","Cabbage","Onion","Potato","Cucumber"},
                {"Juice","Pepsi","Water","Lemonate"}};
        double [][] price={{1.99,1.49,0.48},{1,0.99,2.99,1.99,0.69,1},{3.99,1,4,5}};
        int [][] inventory={{10,100,150},{200,100,110,200,250,50},{80,230,49,95}};
        for (int i=0;i<grocery.length;i++){
            for (int k=0;k<grocery[i].length;k++){
                System.out.println("The product name is "+grocery[i][k]+" the price is "+price[i][k]+" inventory number is "+
                        inventory[i][k]);

            }
        }
    }
}
