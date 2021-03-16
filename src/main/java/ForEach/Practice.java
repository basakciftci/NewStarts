package ForEach;

public class Practice{
    public static void main(String[] args){
//        String [] element=new String[] {"Aiturgan","Aizhana","Azharkin","Erma","Dimitry","Jamilya"};
//        for (String name:element) {
//            if (name.startsWith( "A" )&&name.length()>5){
//                System.out.println(name);
//            }
//        }
        String [] names=new String[] {"Aiturgan","Aizhana","Azharkin","Erma","Dimitry","Jamilya"};
        int count=0;
        for (String name:names) {
            count=0;
            for (int i=0;i<name.length();i++){

                if (name.charAt( i )=='A'||name.charAt( i )=='a'){

                    count++;
                }}
                System.out.println(name+" A count is  ==>"+count);



    }
}}
