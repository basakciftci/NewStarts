package TernaryPractice;

public class TernaryOperators{
    public static void main(String[] args){
     int spaces=5;
     int passenger=6;
        System.out.println(spaces>=passenger?spaces-passenger:"They can not fit");
        int result=spaces>=passenger?spaces-passenger:passenger+spaces;
        System.out.println(spaces<passenger?passenger--:spaces++);
        System.out.println(passenger);
        System.out.println(spaces);

        String str=10>6?"hello":"java";//String str=10>6?"hello":10; it will give error.
        System.out.println(str);

        int num=10>6 ? 10:10;//



    }
}
