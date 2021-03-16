package ArrayPractice;

public class MissingNumber{
    public static void main(String[] args){
        int [] nums={0,1,8,2,6,7,9,3,4};
        int sum=0;
        int count=9*10/2;
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
        }int missing=count-sum;
        System.out.println(missing);


        int []num={0,1,2,3,4,6,7,8,9};
        for (int i=0;i<num.length;i++){
            if (i!=num[i]){
                System.out.println(i);
                break;
            }
        }
    }
}
