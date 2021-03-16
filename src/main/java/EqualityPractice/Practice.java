package EqualityPractice;

public class Practice{
    public static void main(String[] args){
        Practice practice=new Practice();
        Practice practice1=new Practice();
        Practice practice2=practice;

        System.out.println(practice==practice1);
        System.out.println(practice.equals(practice1));
        System.out.println(practice.equals(practice2));
        System.out.println(practice==practice2);
        practice.equals();
        System.out.println("=================================");
        String name="Tima";
        String name1="Tima";
        String name2= new String("Tima");
        System.out.println(name.equals(name2));
        System.out.println(name==name1);
        System.out.println("====================");
        Integer num=10;
        Integer num1=new Integer(10);
        System.out.println(num==num1);
        System.out.println(num.equals(num1));
        Practice pr=Practice.createPractice();
    }
    public void equals(){
        System.out.println("This is equals method in practice");
    }
    public static Practice createPractice(){
        Practice pr=new Practice();
        return pr;
    }
}
