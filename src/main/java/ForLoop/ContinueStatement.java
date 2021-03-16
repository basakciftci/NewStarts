package ForLoop;

public class ContinueStatement{
    public static void main(String[] args){
        for (int i=0;i<5;i++){
            if (i==3){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("==================");

        String str="letter make you feel comfortable";
        for (int i=0;i<str.length();i++){
            if (str.charAt( i )=='e'|| str.charAt( i )=='k'){
                continue;
            }
            System.out.println(str.charAt( i ));
        }
    }
}
