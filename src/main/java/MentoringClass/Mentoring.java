package MentoringClass;

import java.util.Scanner;

public class Mentoring{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
//        int n=input.nextInt();
//        int result=0;
//        for (int i=1;i<=10;i++){
//            result=i*n;
//            System.out.println(""+i+"x"+i+"="+result);
//        }

        int t=input.nextInt();
        for(int i=0;i<t;i++){
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();
            int result=a;
            for(int j=0;j<=n;j++){
                int powertwo=(int)Math.pow(2,j);
                int addtoRes=b*powertwo;
                result+=addtoRes;
                System.out.print(result);
                System.out.print("");
            }

        }
    }
}
