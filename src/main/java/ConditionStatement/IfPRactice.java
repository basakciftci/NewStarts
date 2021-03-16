package ConditionStatement;

public class IfPRactice{
    public static void main(String[] args){
        int k=4;
        if(k>5)
            k++;
            k++;

        System.out.println(k);
        int r=5;
        if (r<5){
            r++;
            r++;
        }
        System.out.println(r);
        int x=5;
        int y=6;
        if (x<y)
            x++;//-->executed
            ++y;//always executed
            x--;//always executed
        System.out.println(x);
        System.out.println(y);



    }
}
