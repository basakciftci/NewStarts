package ArrayPractice;

import java.util.Arrays;

public class ArraySorting{
    public static void main(String[] args){
        int []arr={1,5,3,10,8};
        System.out.println( Arrays.toString(arr));
        Arrays.sort( arr );//it will sort the array
        System.out.println(Arrays.toString( arr ));
        int [] reversed=new int[5];
        for (int i=0;i<arr.length;i++){
            reversed[i]=arr[4-(i)];
        }
        System.out.println(Arrays.toString( reversed ));
        //second way
//        int [] largest=new int [arr.length];
//        for (int i=0,k=arr.length-1;i<arr.length;i++,k--){
//            largest[i]=arr[k];
//
//        }
//        System.out.println(Arrays.toString( largest ));

    }
}
