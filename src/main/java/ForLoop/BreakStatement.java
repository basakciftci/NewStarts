package ForLoop;

public class BreakStatement{
    public static void main(String[] args){
        for (int i=0;i<10;i++){
            System.out.println(i);
            if (i==5){
                break;
            }
           // System.out.println(i);
        }
        System.out.println("===============");
        for (int i=0;i<10;i++){
            System.out.println(i);
            for (char ch='A';ch<'D';ch++){
                System.out.println(ch);
                if(ch=='B'){
                    break;
                }
            }
        }

    }
}
