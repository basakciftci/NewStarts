package ObjectPractice;

public class Student{
    String firstName;
    String lastName;
    int age;
    char gender;
    String nationality;
    //public is access modifier;
    //void is return type in java, (if you are not returning anything we need use void return type)
    //method signature: name of the method+parameter(study(parameter)

    public void study(String day){
        System.out.println("The student is studying "+day);

    }

    public static void main(String[] args){
        Student st=new Student();
        st.firstName="Arslan";
        st.lastName="Kabul";
        st.age=30;
        st.gender='F';
        st.nationality="USA";
        st.study("Monday");
        System.out.println("the firstname "+st.firstName+ " LAst name "
                +st.lastName+" gender "+st.gender+" age is  "
                +st.age+" natio" + st.nationality);

        Student me=new Student();
        me.firstName="Basak";
        me.lastName="Ciftci";
        me.age=30;
        me.gender='F';
        me.nationality="Turkey";
        System.out.println("firstname "+me.firstName+" lastname "+me.lastName+" gender "+me.gender
        +" age "+me.age+" nationality "+me.nationality);
        me.read();

    }public void read(){
        System.out.println("The student reading ");
    }public int studyTime(){
        int hour=10;
        System.out.println("Student is studying "+hour+" hours");
        return  hour;
    }


}
