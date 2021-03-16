package StringBuilder;

public class EqualityStringBuilder{
    public static void main(String[] args){
        StringBuilder sName=new StringBuilder();
        StringBuilder sName1=new StringBuilder();
        StringBuilder sName2=sName.append("Techtorial");
        System.out.println(sName==sName1);
        System.out.println(sName==sName2);

        System.out.println("============");
        StringBuilder sName3=new StringBuilder("Tech");
        StringBuilder sName4=new StringBuilder("Tech");
        System.out.println(sName3.equals(sName4));
        test1(new StringBuilder("GAMDKJDHO2UY65HFE7KN12BL39KGAE"));
        System.out.println("==============");
        test2(new StringBuilder("GAMDKJDHO2UY65HFE7KN12BL39KGAE"));

    }
    public static void test1(StringBuilder str){
        for (int i=0;i<str.length();i++){
            for (char k='D';k<='G';k++){
                if (str.charAt(i)==k)
                    System.out.println(str.charAt(i));
            }
        }


    }
    public static void test2(StringBuilder str){
        for (int i=0;i<str.length();i++){
            char d=str.charAt(i);
          if ( d>='D'&& d<='G'){
              System.out.println(d);
          }
            }

}}
