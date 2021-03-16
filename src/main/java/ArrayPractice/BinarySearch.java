package ArrayPractice;

import java.util.Arrays;

public class BinarySearch{
    public static void main(String[] args){
        int []arr={4,5,3,10,30};
        Arrays.sort(arr);
        System.out.println(Arrays.toString( arr ));
      int indexNum=  Arrays.binarySearch( arr ,10);
        System.out.println(indexNum);
    }
}
