package ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListBasic{
    public static void main(String[] args){
        ArrayList bankCards=new ArrayList();
        bankCards.add( "Visa" );
        System.out.println(bankCards.get( 0 ));
        System.out.println(bankCards.size());
        bankCards.add( "MasterCard" );
        System.out.println(bankCards.size());
        bankCards.add( "AMex" );
        bankCards.add( "Chase" );
        bankCards.add( 2,"Discovery" );
        System.out.println(bankCards.get( 3 ));
        System.out.println(bankCards);
        bankCards.set( 1 ,"BofA");
        System.out.println(bankCards);
        bankCards.add( 100 );
        bankCards.add( true );
        System.out.println(bankCards);
        System.out.println("=======================");
        for (int i=0;i<bankCards.size();i++){
            System.out.println(bankCards.get( i ));
        }
        for (Object card:bankCards){
            System.out.println(card);
        }
        String word="I love java";
        String [] word2=word.split( " " );
        System.out.println( Arrays.toString(word2));
    }

}
