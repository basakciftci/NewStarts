package String;

public class ReplacePractice{
    public static void main(String[] args){
        String str="microphone";
        str=str.replace( 'o','e' );
        System.out.println(str );
        str=str.replace( "en","an" );
        System.out.println(str);
        String java="jdk-1.8.0_231";
        String db="jdk-1.8.0_231";
       java=java.replace( "-"," " );
        System.out.println(db.equals( java ));
       java= java.replace( "p","s" );
        System.out.println(java );

        System.out.println("===================");

        String sent=" Everything will be good";
        System.out.println( sent.trim());
    }
}
