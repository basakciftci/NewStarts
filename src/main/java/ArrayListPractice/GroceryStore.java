package ArrayListPractice;

import java.util.ArrayList;
import java.util.List;

public class GroceryStore{
    /**
     * This class will automatically add values to shoppingList list
     * and it will print welcome to Grocery Store message
     * with items that needs to bought from store
     *
     * Methods:
     * buy(String item)->  this method has to remove specific item from
     * your shoppingList
     * return(String item)=> this method will add returned item back to shoppingList
     * car()=>Heading to Grocery Store message
     * isOpen()=>has to print true if store is open, else false
     */
   static List<String> shoppingList=new ArrayList<>();
  static int time;
    static {
        shoppingList.add("Bread");
        shoppingList.add("Milk");
        shoppingList.add("Cereal");
        shoppingList.add("Potato");
        shoppingList.add("Oil");
        System.out.println("Welcome to grocery store!");
        System.out.println(shoppingList);

    }
    public boolean isOpen(int time){
        this.time=time;
        if (time<22&&time>=9){
            System.out.println("The store is open");
            return true;
        }
        System.out.println("The store is close");
        return false;
    }
    public String returnItem(String returnItem){
        shoppingList.add(returnItem);
        return "item returned";
    }
    public String buy(String itemName){
        shoppingList.remove(itemName);
        return "Item as added to list";
    }
    public void car(){

        System.out.println("Heading to Grocery Store.Lets buy a lot of things");
    }
}
