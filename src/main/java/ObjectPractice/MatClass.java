package ObjectPractice;

public class MatClass{
    public int sum(int a, int b){
        if (a>b)
            return a+b;
        return 0;

    }
    public int sum(int ... nums){
        int sum=0;
        for (int i=0;i< nums.length;i++){
            sum+=nums[i];
        }return sum;
    }
    public int sum1(int [] nums){
        int sum=0;
        for (int i=0; i < nums.length; i++) {
            sum+=nums[i];
        }
        return sum;
    }
    public static void main(String[] args){
        MatClass mat=new MatClass();
        int sum=mat.sum( 12,23,4,6,7,8 );
        int [] num={12,23,4,6,7,8};
        System.out.println(sum );
        System.out.println(mat.sum1( num ));
    }
}
