package ForLoop;

public class PrintLetterNumber{
    public static void main(String[] args){
        String str="J7A5VA-5 I5S T6HE B8E+=ST 56COD7IN8G L88753AN3G2UA4GE4";
        for (int i=0; i <= str.length() - 1; i++) {
            for (char ch='A'; ch <= 'Z'; ch++) {
                if (str.charAt( i ) == ch) {
                    System.out.print( ch );
                }
            }
        }System.out.println();
        System.out.println("==================");
        for (int i=0; i <= str.length() - 1; i++) {
            for (char ch='0'; ch <= '9'; ch++) {
                if (str.charAt( i ) == ch) {
                    System.out.print( ch );
                }}}
    }
}
