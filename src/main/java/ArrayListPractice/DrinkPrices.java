package ArrayListPractice;
import java.util.Arrays;
import java.util.List;

public class DrinkPrices{
    public static void main(String[] args){
        List<String>drinks=Arrays.asList("Coffee $2.20",
                "Cappucino $4.5","LAtte $3.4","Hot Chocolate $4.1","Black tea $3.0");
        for (int i=0;i<drinks.size();i++){
            int indexNum=drinks.get(i).indexOf("$");
            String priceStr=drinks.get(i).substring(indexNum+1);
            double price=Double.parseDouble(priceStr);
            double newPrice=price*1.1;
            String prc=drinks.get(i).substring(0,indexNum)+newPrice;
            drinks.set(i,prc);
        }
        System.out.println(drinks);

    }
}
