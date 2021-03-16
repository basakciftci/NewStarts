package ArrayPractice;

import java.util.Arrays;

public class Example{
    public static void main(String[] args){
        int [] num=new int[]{23,43,12,10,54,25,98,7};
        int count=0;
        Arrays.sort(num);
        for (int i=0;i<num.length;i++){
            if (num[i]>10 &&num[i]<30){
                System.out.println(num [i]);
            count++;
            }
        }
        System.out.println("The count is "+count);
        System.out.println(Arrays.toString( num ));
    }
}
