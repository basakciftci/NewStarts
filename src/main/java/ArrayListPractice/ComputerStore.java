package ArrayListPractice;

import ConstructorPractice.BookStore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComputerStore{
    public static void main(String[] args){

        List<Computer> computers=new ArrayList<>();
        Computer computer1=new Computer("Macbook",2018,2000);
        Computer computer2=new Computer("Lenovo",2019,1200);
        Computer computer3=new Computer("Dell",2017,1600);
        Computer computer4=new Computer("HP",2019,1400);
        Computer computer5=new Computer("Asus",2015,1100);
        Computer computer6=new Computer("MAc",2020,1800);
        computers.add(computer1);
        computers.add(computer2);
        computers.add(computer3);
        computers.add(computer4);
        computers.add(computer5);
        computers.add(computer6);

        System.out.println(computers.get(0).brand);
        System.out.println(computer1.year);
        System.out.println(computers.get(3).year);
        System.out.println("===================");
        for (int i=0;i<computers.size();i++){
            System.out.println(computers.get(i).brand);
        }
        for (Computer comp:computers){
            System.out.println(comp.price);
        }
        System.out.println("==============");
        computers.get(0).price=computers.get(0).price-100;
        for (int i =0;i<computers.size();i++){
            computers.get(i).price=computers.get(i).price-100;
            System.out.println(computers.get(i).price);
        }
        System.out.println("==============");
        for (Computer computer:computers){
            computer.price=computer.price-100;
            System.out.println(computer.price);
        }
        System.out.println("-----");
        for (int i=0;i<computers.size();i++){
            if (computers.get(i).price<=1000)
            //System.out.println(computers.get(i).price);
            System.out.println(computers.get(i).brand);
        }

        List<BookStore> listOfBooks=new ArrayList<>();
        listOfBooks.add(new BookStore( "Java OCa ",120));
        listOfBooks.add(new BookStore("Selenium",23));
        listOfBooks.add(new BookStore("Cucumber",55));
        for (int i=0;i<listOfBooks.size();i++){
            System.out.println(listOfBooks.get(i).title);
        }
        for (BookStore bookStore:listOfBooks){
            System.out.println(bookStore.title);
            System.out.println(bookStore.price);
        }

        List<Integer> nums=Arrays.asList(4,5,3,6);
        for (Integer num:nums){
            if (num==6){
                num=60;
            }}//it will ot be change
            System.out.println(nums);
        for (int i=0;i<nums.size();i++){
            if (nums.get(i)==6){
                nums.set(i,60);
            }
        }//it will change
        System.out.println(nums);



}
}
