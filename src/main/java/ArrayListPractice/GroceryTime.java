package ArrayListPractice;

public class GroceryTime{
    public static void main(String[] args){
        GroceryStore groceryStore=new GroceryStore();
        int time=21;
        System.out.println(groceryStore.isOpen(time));
        groceryStore.car();
        groceryStore.buy("Oil");
        System.out.println(groceryStore.shoppingList);
        groceryStore.buy("Milk");
        System.out.println(groceryStore.shoppingList);
        groceryStore.buy("Potato");
        System.out.println(groceryStore.shoppingList);

    }
}
