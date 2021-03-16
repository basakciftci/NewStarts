package ForLoop;

import java.util.ArrayList;
import java.util.List;

public class OptionalLAbel{
    public static void main(String[] args){
        for (int i=0;i<10;i++){
            System.out.println(i);
            if (i==5){

                break;
            }
        }
        String []names={"ARIET","ULAN","MUAMMER"};
        outerLOOP:
        for (int i=0;i<names.length;i++){
            innerLoOP:
            for (int k=0;k<names[i].length();k++){
                if (names[i].charAt(k)=='A'){
                   break outerLOOP;
                }
                System.out.print(names[i].charAt(k)+",");
            }
            System.out.println();
        }
        String [][] names1={{"Adam","John"},{"Kushal","Priyanka","Sameer"},{"Lee","Mao"}};
        arrayM(names1);
    //    outer:
//        for (int i=0;i<names1.length;i++){
//            for (int k=0;k<names1[i].length;k++){
//                if (names1[i][k]=="Priyanka"){
//                    break outer;
//                }
//                System.out.println(names1[i][k]);
//
//            }
//        }
    }
    public static void arrayM(String [][] list){
        outer:
        for (int i=0;i<list.length;i++){
            for (int k=0;k<list[i].length;k++){
                if (list[i][k]=="Priyanka"){
                    break outer;
                }
                System.out.println(list[i][k]);

            }
        }
    }
    public void printM(){
        System.out.println("M");
    }
}
