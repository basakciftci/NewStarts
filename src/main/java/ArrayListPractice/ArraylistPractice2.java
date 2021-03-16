package ArrayListPractice;

import java.util.*;

public class ArraylistPractice2{
    public static void main(String[] args){
        List<String>words=new ArrayList<>();
        words.add("Java");
        words.add("Love");
        words.add("Me");
        words.add("I");
        words.add("Love");
        words.add("You");
        words.add("Too");
       // Arrays.sort(new String[]{});
        System.out.println(words);
        Collections.sort(words);
        System.out.println(words);
        words.remove(0);
        System.out.println(words);
        words.remove("Me");
        System.out.println(words);
        words.remove("Love");
        System.out.println(words);
        System.out.println(words.contains("Java"));
        words.set(2,"Too");
        System.out.println(words);
        words.add(2,"I");
        System.out.println(words);
        //converting Arraylist (List) to an Array using words.toArray();
        Object [] wordsInArray=words.toArray();
        System.out.println(wordsInArray[3]);
        System.out.println(Arrays.toString(wordsInArray));
        //converting from array to arraylist using Arrays.asList(array) method
        List<Object>list=Arrays.asList(wordsInArray);
        System.out.println(list);
        System.out.println("========================");

        List<Integer>number=new ArrayList<>();
        number.add(4);
        number.add(1);
        number.add(-13);
        number.add(5);
        number.add(0);
        System.out.println(number);
        Collections.sort(number);
        System.out.println(number);

        number.remove(number.indexOf(0));
        number.remove(Integer.valueOf("5"));
        System.out.println(number);
        number.clear();
        System.out.println(number);




    }
}
