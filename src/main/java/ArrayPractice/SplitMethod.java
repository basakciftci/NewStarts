package ArrayPractice;

import java.util.Arrays;

public class SplitMethod{
    public static void main(String[] args){
        String date="11-7-2020-12-20";
        String[] value=date.split( "-" );
        System.out.println( Arrays.toString(value));
        if (value[2].equalsIgnoreCase( "2020" )){
            System.out.println("The year is 2020");
        }else {
            System.out.println("The year is not 2020");
        }


        String sentence="The split() method is used to split a string into an array of substrings, " +
                "and returns the new array. Tip: If an empty string is used as the separator, " +
                "the string is split between each character. " +
                "Note: The split() method does not change the original string.";
        String [] str=sentence.split( " " );
        System.out.println(Arrays.toString( str ));
        for (String word:str){
            if (word.length()<4){
                System.out.println(word);
            }
        }
        String jv="Array.is.today's.topic";
        String [] sss=jv.split( "//." );//we have to use "//" for "."
        System.out.println(Arrays.toString( sss ));
    }
}
