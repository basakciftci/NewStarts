package ArrayPractice;

public class ArrayPractice{
    public static void main(String[] args){
        String [] str={"Tech","Array","Basak","Kadir","Family"};
        for (String name:str){
            for (int i=name.length()-1;i>=0;i--){
                System.out.println(name.charAt( i ));
              //  System.out.print(name.charAt( i ) );
            }
            System.out.println("*******");
        }

    }
}
