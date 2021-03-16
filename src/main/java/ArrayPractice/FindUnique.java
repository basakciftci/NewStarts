package ArrayPractice;

public class FindUnique{
    public static void main(String[] args){
        int [] num={1,1,2,2,3,4,4,5,6,7,7};
        for (int i=0;i<num.length;i++){
            if (num[i]==num[i+1]){
                i++;
            }else{
                System.out.println(num[i]);

            }
        }
    }
}
