package ArrayPractice;

public class NameDisplayCount{
    public static void main(String[] args){
        String [] names={"Azhar","Tima","Asan","Dimitry","Erma","Tima","Asan","Jamilya","Tima"};
        int count=0;


            for (int i=0;i<names.length;i++){
                count=1;
                for (int k=i+1;k<names.length;k++){
                    if (names[i].equalsIgnoreCase(names[k])){
                        count++;

                    }

                }
                System.out.println(names[i]+"="+count);
            }
        }
    }

