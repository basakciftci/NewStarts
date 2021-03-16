package ObjectPractice;

import java.util.Scanner;

public class PhoneTest{
    public static void main(String[] args){
        Phone phone=new Phone();
        System.out.println("Welcome to our Contact List Application");
        System.out.println("Please enter your name");
        Scanner input =new Scanner(System.in);
        String name=input.next();
        phone.brandName=name;
        System.out.println("Please enter your passcode");
        String passcode=input.next();
        phone.passcode=passcode;
        int exit=0;
        do {
            phone.getInstruction();
            System.out.println("Please enter your choose");
            int option=input.nextInt();
            switch (option){
                case 1:
                    System.out.println("Please enter your passcode");
                    String code=input.next();
                    phone.login(code);
                    break;
                case 2:
                    phone.displayContact();
                    break;
                case 3:
                    System.out.println("Please enter new contact name");
                    String newName=input.next();
                    System.out.println("Please enter phone number");
                    String newPhone=input.next();
                    phone.addNewContact( newName,newPhone );
                    break;
                case 4:
                    System.out.println("Please enter the old name");
                    String oldName=input.next();
                    System.out.println("Please enter the new name");
                    String newNm=input.next();
                    phone.updateName( oldName,newNm );
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Please enter old phune number");
                    String oldPhone=input.next();
                    System.out.println("Please enter new phone number");
                    String newPhon=input.next();
                    phone.updateNum( oldPhone,newPhon );
                    break;
                case 6:
                    System.out.println("Please enter the name you want to remove");
                    String remove=input.next();
                    phone.remove( remove );
                    break;
                case 7:
                    System.out.println("Please enter the number you want to search");
                    String searchphone=input.next();
                    phone.searchPhone(  searchphone);
                    break;
                case 8 :
                    System.out.println("Please enter the name you want to search");
                    String nameSearch=input.next();
                    phone.serchName( nameSearch );
                    break;
                case 9:
                    exit=9;
                    break;
            }

        }while (exit!=9);
        System .out.println("Thank you for using us.");
    }
}
