package ObjectPractice;

import java.util.Scanner;

public class RealBank{

    public static void main(String[] args){
        System.out.println("Welcome to the Chase Bank. What is your name");
        Scanner input=new Scanner( System. in );
        System.out.println("Welcome "+input.next()+"!");
        int exit=0;
        BankAccount account=new BankAccount();
        do {
            account.getInstruction();
            System.out.println( "Please enter your choose" );
            int myOption=input.nextInt();

            switch (myOption) {
                case 0:
                    account.display();
                    break;
                case 1:
                    System.out.println( "Please enter deposit amount" );
                    int depositAmount=input.nextInt();
                    account.deposit( depositAmount );
                    break;
                case 2:
                    System.out.println( "Please enter withdraw amount" );
                    int withdrawAmount=input.nextInt();
                    account.withdraw( withdrawAmount );
                    break;
                case 3:
                    System.out.println("Please enter your name");
                    String name=input.next();
                    System.out.println("Please enter account number");
                    int accountNum=input.nextInt();
                    System.out.println("Please enter balance");
                    int balance=input.nextInt();
                    System.out.println("Please enter username");
                    String username=input.next();
                    System.out.println("Please enter password");
                    String password=input.next();
                    System.out.println("Please enter account opendate ");
                    String opendate=input.next();
                    account.signUp(name,accountNum,balance,username,password,opendate);
                    break;
                case 4:
                    System.out.println("Please enter username");
                    String uname=input.next();
                    System.out.println("Please enter password");
                    String passwrd=input.next();
                    account.login( uname,passwrd );
                    break;
                case 5:
                    exit=5;
                    break;
            }
        } while (exit != 5) ;
        System.out.println("Thank you for working with us");


    }
}
