package SwitchPractice;

public class NestedSwitchStatement{
    public static void main(String[] args){
        char ch='a';
        int number=5;
        String animalName="Dog";
        final String animal="Cat";
        switch (ch){
            case 'a':
                switch (number){
                    case 5:
                        System.out.println(""+ch+5);
                        break;
                    case 10:
                        System.out.println(""+ch+10);
                        break;
                }
                break;
            case 'b':
                 switch (animalName){
                     case "Dog":
                         System.out.println("Your animal name is Dog" );
                         break;
                     case animal :
                         System.out.println("Your animal name is Cat");
                         break;
                 }
                 break;



        }

    }
}
