package ForLoop;

public class FibonacciNumber{
    public static void main(String[] args){
        int preNum=0;
        int nextNum=1;
        int count=0;
        for (int i=1;i<=100;i++){
            if (preNum>100){
                break;
            }
            System.out.println(preNum+"");
            int sum=preNum+nextNum;
            preNum=nextNum;
            nextNum=sum;
        count++;
        }
        System.out.println("The count is "+count );
    }
}
