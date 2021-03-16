package AccessModifiers;

public class ModifierPRactice{
    private  int studentNumber=50;
    protected  String name="Basak";
    public  void sum(int number){
        //number=studentNumber;
        System.out.println(studentNumber);
        printout();
    }private  void printout(){
        System.out.println("Private method");
    }
}
