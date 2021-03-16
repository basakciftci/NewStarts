package ArrayPractice;

public class TwoNumSum{
    public static void main(String[] args){
        int [] numbers={0,1,2,3,4,5,6,7,8,9};
        for (int k=0;k<numbers.length;k++){
            for (int i=k+1;i<numbers.length;i++){
                if (numbers[k]+numbers[i]==5){
                    System.out.println(numbers[i] +"+"+numbers[k]+"="+(i+k));
                }
            }
        }
    }
}
