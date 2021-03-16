package StringBuilder;

import java.util.ArrayList;
import java.util.List;

public class StringBuilderPractice{
    public static void main(String[] args){
        String str="";
        for (char i='a';i<='z';i++){
            str+=i;
            //System.out.println(str);
        }
        System.out.println(str);

        StringBuilder stringBuilder=new StringBuilder();
        StringBuilder stringBuilder1=new StringBuilder("Techtorial");
        StringBuilder stringBuilder2=new StringBuilder(10);
        stringBuilder.append(10);
        stringBuilder.append(20);
        System.out.println(stringBuilder);
        stringBuilder.append(" is the number");
        System.out.println(stringBuilder);

        StringBuilder builder=new StringBuilder("Techtorial");
        builder.append(2019).append(true);
        System.out.println(builder);

        StringBuilder success=new StringBuilder().append(2020);
        System.out.println("2020".charAt(0));
        System.out.println(new String("2020").charAt(1));

        StringBuilder alp=new StringBuilder();
        for (char i='a';i<='z';i++){
            alp.append(i);
        }
        System.out.println(alp);

        StringBuilder succes=new StringBuilder("Working hard");
        succes.append(" in2020");
        StringBuilder bul=succes.append(" summer");
        System.out.println(succes);
        System.out.println(bul);

        bul.append(true).append(2.6);
        System.out.println(succes);
        System.out.println(bul);

        StringBuilder builder1=new StringBuilder("School");
        succes=builder1;
        String newWord=builder1.toString();
        System.out.println(newWord);


        StringBuilder methods=new StringBuilder("Computer");
        System.out.println(methods.charAt(2)=='m');
        System.out.println(methods.indexOf("r"));
        System.out.println(methods.indexOf("k"));
        System.out.println(methods.length());
        System.out.println(methods.substring(2));
        System.out.println(methods.substring(2,7));
        System.out.println(methods);

        methods.insert(8," Apple");
        System.out.println(methods);
        ArrayList<StringBuilder> list=new ArrayList<>();
        list.add(new StringBuilder("Table"));
        list.add(new StringBuilder("Cup"));
        list.add(new StringBuilder("Phone"));
        list.add(new StringBuilder("Pencil"));
        changeLastChar(list);
        System.out.println(list);
        StringBuilder sss=new StringBuilder();
        sss.append("preparation");
        sss.insert(0,"$");
        sss.insert(12,"$");
        System.out.println(sss);
        sss.delete(0,3);
        System.out.println(sss);
        System.out.println(sss.deleteCharAt(sss.length()-2));
        reversed("BASAK");



    }
    public static StringBuilder changeLastChar(ArrayList<StringBuilder> list){
        StringBuilder str=new StringBuilder();
        for (int i=0;i<list.size();i++){
          //  System.out.println(list.get(i).append("m"));
            System.out.println(list.get(i).deleteCharAt(list.get(i).length()-1));
            System.out.println( list.get(i).insert(list.get(i).length()-1,"m"));
        }
     return str;
    }
    public static  void reversed(String str){
        StringBuilder newStr=new StringBuilder(str);
        newStr.reverse();
       System.out.println(newStr);
    }
}
