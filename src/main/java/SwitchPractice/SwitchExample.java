package SwitchPractice;

import java.util.Scanner;

public class SwitchExample{
    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        System.out.println("Please enter your number");
       int num=input.nextInt();
       String name;
        switch (num){
            case 123:
                System.out.println("What is your lastname");
                name=input.next();
                if (name.equalsIgnoreCase( "turan" )){
                    System.out.println("Your last name is turan");
                }else {
                    System.out.println("You are not Muammer");
                }break;
            case 223:
                System.out.println("What is your age ");
                int age=input.nextInt();
                if (age==22){
                    System.out.println("Your age not true");
                }else{
                    System.out.println("You are not aslan");
                }break;
            case 456:
                System.out.println("Where do you live");
                String place=input.next();
                if (place.equalsIgnoreCase( "sky")){
                    System.out.println("Great, I am living there as well");
                }break;
            default:
                System.out.println("invalid enter");
        }
    }
}
