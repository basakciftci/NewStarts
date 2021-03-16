package ArrayPractice;

import java.util.Arrays;

public class SortArray{
    public static void main(String[] args){
        int [] num={4,7,1,25,35,18,22};
    int temp=0;
        for (int i=0;i<num.length;i++){
            for (int k=i+1;k<num.length;k++){
            if (num[i]>num[k]){
                temp=num[i];
                num[i]=num[k];
                num[k]=temp;
            }

        }
        }System.out.println( Arrays.toString(num));
    }
}
