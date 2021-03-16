package WrapperClasses;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringConverter{

       static String [] prices={"$25","$66","$5","$89","$21"};
        //convert array int without dollar Sign;
    public static int [] priceConvert(String [] prices){
        int[] array=new int[prices.length];
        for (int i=0; i < prices.length; i++) {
            prices[i]=prices[i].substring( 1 );
            array[i]=Integer.valueOf( prices[i] );

        }
        return array;
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString( priceConvert( prices ) ));

    }

    }


