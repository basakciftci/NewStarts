package ConstructorPractice;

public class BookStoreTest{
    public static void main(String[] args){
        BookStore bookStore1=new BookStore( "War and PEace","Leo Tolstoy",20 );
        bookStore1.getDetails();
        BookStore bookStore2=new BookStore( "Java oca Book",50 );
        bookStore2.getDetails();
        BookStore bookStore3=new BookStore( "Selenium Book",30 );
        System.out.println(BookStore.count);
    }
}
