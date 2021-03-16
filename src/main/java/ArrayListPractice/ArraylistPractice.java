package ArrayListPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraylistPractice{
    public static void main(String[] args){
        List<String >prices=Arrays.asList("$22.5","$41.2","$8.9","$2.4");
        List<String> items=Arrays.asList("2","4","1","9");

        //get the total expenses
        double totalExpense=0;
        for (int i=0;i<prices.size();i++){
            int itemNum=Integer.parseInt(items.get(i));
            String price=prices.get(i).substring(1);
            double itemPrice=Double.parseDouble(price);
            totalExpense+=(itemNum*itemPrice);

        }
        System.out.println(totalExpense);

    }
}
