package ForLoop;

public class ReplaceChar{
    public static void main(String[] args){
        String str="Techtorial";
        for (int i=0;i<str.length();i++){
            str=str.replace( str.charAt( i ),'a' );
            System.out.println(str);
        }
    }
}
