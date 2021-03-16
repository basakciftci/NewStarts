package ObjectPractice;

public class MathMethods{
    public int square(int number ){
        int squareNum=number*number;
        return squareNum;
    }
    public void multiplication(int number){
        for (int i=1;i<=10;i++){
            System.out.println(number+"*"+i+"="+(number*i));
        }
    }
    public int sum(int num1, int num2){
        int sum=num1+num2;
        return sum;
    }

    public int remainder(int main,int remain){
        return main%remain;
    }
    public int sumArray(int []numbers){
        int sum=0;
        for (int i=0;i<numbers.length;i++){
            sum+=numbers[i];
        }return sum;
    }
    public void character(String name){
        for (int i=0;i<name.length();i++){
            System.out.println(name.charAt( i ));
        }
    }
    public static void main(String[] args){
        MathMethods test=new MathMethods();
       int result= test.square( 15 );
        System.out.println(result);
        test.multiplication( 8 );
        int resultSum=test.sum( 1234,4321 );
        System.out.println(resultSum);
        int remain=test.remainder( 105,10 );
        System.out.println(remain);
        int [] nums={1,2,3,4,55};
        int sumArray=test.sumArray( nums );
        System.out.println(sumArray);
       test.character( "School" );

    }
}
