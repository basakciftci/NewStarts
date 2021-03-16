package ForLoop;

public class CharInForLoop{
    public static void main(String[] args){
        for (char ch='A';ch<'E';ch++){
            System.out.println(ch);
        }
        System.out.println("===========================");
        char ch='A';
        for (;ch<'E';ch++){
            int num=ch;
            System.out.println(ch);
            System.out.println(num);
        }
        System.out.println(ch);
    }
}
