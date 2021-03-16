package ObjectPractice;

public class Book{
    int bookTotal;


    public void read(){
        if (bookTotal>=50){
            bookTotal=bookTotal-50;
            System.out.println("Page total "+bookTotal);
        }else{
            bookTotal-=bookTotal;
            System.out.println("The book is finished");
        }

    }

    public static void main(String[] args){

        Book book=new Book();
        book.bookTotal=200;
        book.read();
        book.read();
        book.read();
        book.read();
    }
}
