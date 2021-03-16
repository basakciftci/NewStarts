package ConstructorPractice;

public class StudentTest{
    public static void main(String[] args){
        Student student=new Student( "Basak" ,12345);
        Student s1=new Student( "LAmiya",0001 );
        Student s2=new Student( "Bermet",235 );
       // s1.schoolName="Techtorial";
        System.out.println(s2.schoolName);
      //  Student.schoolName="Techtorial2";
        System.out.println(student.schoolName);
        System.out.println(s1.schoolName);
        System.out.println(s2.schoolName);

    }


}
