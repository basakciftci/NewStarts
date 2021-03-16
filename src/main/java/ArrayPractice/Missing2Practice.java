package ArrayPractice;

public class Missing2Practice{
    public static void main(String[] args){
        int [] nums={11,12,13,14,15,16,18,19};
        int count=(19*20/2)-(10*11/2);
        int sum=0;
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];

        }int missing=count-sum;
        System.out.println(missing);
        System.out.println();
        int []numbers={11,12,13,14,15,16,18,19};
        for (int i=0;i<numbers.length;i++){
            if (i +11!=numbers[i]){
                System.out.println(i+11);
            break;
            }
        }

    }
}
