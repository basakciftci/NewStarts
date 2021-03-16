package MentoringClass;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InterviewTasks{
 /*
    Given string "anyString"
    Find all dublicate characters and replace them with "*"

    Example: "Techtorial" -> "*ech*orial"

     */

    public static String replaceDuplicates1(String str){
        str=str.toLowerCase();

        for (int i=0; i < str.length(); i++) { // absdada
            char first=str.charAt( i );

            if (first == '*') {
                continue;
            }

                for (int q=i + 1; q < str.length(); q++) {
                    char second=str.charAt( q );

                    if (first == second) {
                        str=str.replace( first, '*' );
                        break;
                    }}
                }

            return str;
        }

        public String replaceDuplicates2(String str){
        str=str.toLowerCase();

        List<Character> excistingChars=new ArrayList<>();

        for (int i=0; i < str.length(); i++) { // absdada
            char current=str.charAt( i );

            if (current == '*') {
                continue;
            }

            if (excistingChars.contains( current )) {
                str=str.replace( current, '*' );
            } else {
                excistingChars.add( current );
            }
        }

        return str;
    }
    private String replaceDuplicates3(String str){
        str=str.toLowerCase();

        Map<Character, Integer> count=new HashMap<>();

        str.chars().mapToObj( ch -> (char) ch ).forEach( ch -> count.put( ch, (count.containsKey( ch )) ? count.get( ch ) + 1 : 1 ) );

        for (int i=0; i < str.length(); i++) { // absdada
            char current=str.charAt( i );
            if (current != '*' && count.get( current ) > 1) {
                str=str.replace( current, '*' );
            }
        }

        return str;
    }
    private static String replaceDuplicates4(String str){
        str = str.toLowerCase();

        for(int i=0; i<str.length(); i++) { // absdada
            char current = str.charAt(i);

            if(current != '*' && str.matches(".*"+current+".*"+current+".*")) { // .*a.*a.* -> acac, caca, caac ..
                str = str.replace(current, '*');
            }
        }

        return str;
    }

    @Test
    public void test1(){
        String param = "adsab";
        String expected = "*ds*b";

        long start = System.nanoTime();
        String actual = replaceDuplicates1(param);
        long finish = System.nanoTime();

        System.out.println("method 1 time: "+(finish-start));

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test2(){
        String param = "adsab";
        String expected = "*ds*b";

        long start = System.nanoTime();
        String actual = replaceDuplicates2(param);
        long finish = System.nanoTime();

        System.out.println("method 2 time: "+(finish-start));

        Assert.assertEquals(expected,actual);
    }



    @Test
    public void test3(){
        String param = "adsab";
        String expected = "*ds*b";

        long start = System.nanoTime();
        String actual = replaceDuplicates3(param);
        long finish = System.nanoTime();

        System.out.println("method 3 time: "+(finish-start));

        Assert.assertEquals(expected,actual);
    }



    @Test
    public void test4(){
        String param = "adsab";
        String expected = "*ds*b";

        long start = System.nanoTime();
        String actual = replaceDuplicates4(param);
        long finish = System.nanoTime();

        System.out.println("method 4 time: "+(finish-start));

        Assert.assertEquals(expected,actual);
    }



}


