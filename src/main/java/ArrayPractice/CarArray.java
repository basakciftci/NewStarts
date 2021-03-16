package ArrayPractice;

import java.util.Arrays;

public class CarArray{
    public static void main(String[] args){
        String [] cars=new String[5];
        cars[0]="BMW";
        cars[1]="Toyota";
        cars[2]="Honda";
        cars[3]="Nissan";
        System.out.println( Arrays.toString(cars));//to display all array elements in one line
       // cars [10]="Tesla";==> it will give runtimeError
        for (int i=0;i<cars.length;i++){
            System.out.println(cars[i]);
        }
        System.out.println("===================");


        int nums[]=new int[]{200,300,400,234,6545,887};
        System.out.println(Arrays.toString( nums ));
        int sum=0;
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        System.out.println(sum);
    }
}
