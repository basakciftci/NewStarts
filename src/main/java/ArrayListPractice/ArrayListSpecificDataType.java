package ArrayListPractice;

import java.util.ArrayList;

public class ArrayListSpecificDataType{
    public static void main(String[] args){
        ArrayList<String> program=new ArrayList();
        program.add("Java");
        program.add("C#");
        program.add("Python");
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(55);
        numbers.add(64);
        numbers.add(23);
        numbers.add(16);
        for (Integer num : numbers){
            if (num % 2 == 0){
                System.out.println(num);
            }
        }
        ArrayList<String> shoppingList=new ArrayList();
        shoppingList.add("Milk");
        shoppingList.add("Cereal");
        shoppingList.add("Coffee");
        shoppingList.add("Carrot");
        shoppingList.add("Sugar");
        shoppingList.add("Bread");
        System.out.println(shoppingList);
        shoppingList.set(shoppingList.indexOf("Coffee"),"Tea");
        System.out.println(shoppingList);
        System.out.println(shoppingList.contains("Bread"));
        shoppingList.remove("Milk");
        System.out.println(shoppingList);
        System.out.println(shoppingList.isEmpty());
        if (shoppingList.isEmpty()){
            System.out.println("Done");
        }else {
            System.out.println("KEep shopping");
        }
        shoppingList.clear();
        System.out.println(shoppingList);


    }
}
