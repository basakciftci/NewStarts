package ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComparingArrayList{
    public static void main(String[] args){
        ArrayList<String> bookShelf=new ArrayList<>();
        ArrayList<String> bookShelf2=new ArrayList<>();

        bookShelf.add("JAva oca book");
        bookShelf.add("Agile Project");
        bookShelf.add("Mind Hacking");
        bookShelf.add("WAr and Peace");

        bookShelf2.add("JAva oca book");
        bookShelf2.add("Agile Project");
        bookShelf2.add("Mind Hacking");
        bookShelf2.add("WAr and Peace");

        if (bookShelf.equals(bookShelf2)){

            System.out.println("Books are same");
        } else {
            System.out.println("Different books");
        }
        bookShelf2.set(bookShelf2.indexOf("WAr and Peace"), "Selenium book");
        if (bookShelf.equals(bookShelf2)){

            System.out.println("Books are same");
        } else {
            System.out.println("Different books");

        }

        List<String> studentNames=new ArrayList<>();
        String[] names={"Kate","Nicole","Mike","PAtel","Kushal"};
        studentNames=Arrays.asList(names);
        System.out.println(studentNames.get(1));
        List<String>stNames=Arrays.asList(new String []{"Patel","Arpan"});

    }
}