package ConstructorPractice;

public class BookStore{
   public String title;
   static String author;
    public int price;
  static  int count;
    public BookStore(String title,int price){
        this.title=title;
        this.price=price;
        count++;

    }
    public BookStore(String title, String author, int price){
        this.title=title;
        this.author=author;
        this.price=price;
        count++;
    }
    public void getDetails(){
        System.out.println(title+", "+author+" , $ "+price);
    }


}
