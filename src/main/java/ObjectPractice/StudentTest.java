package ObjectPractice;

public class StudentTest{
    public static void main(String[] args){
        Student me=new Student();
        me.firstName="Basak";
        me.lastName="Ciftci";
        me.age=30;
        me.gender='F';
        me.nationality="Turkey";
        System.out.println("firstname "+me.firstName+" lastname "+me.lastName+" gender "+me.gender
                +" age "+me.age+" nationality "+me.nationality);

        me.study("WEdnesday");
        me.read();
       // me.studyTime();
        int shour=me.studyTime();
        System.out.println("The student study "+(shour*60)+" minutes ");
    }
}
