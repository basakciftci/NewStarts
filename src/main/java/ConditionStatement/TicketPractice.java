package ConditionStatement;

import java.util.Scanner;

public class TicketPractice{
    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        System.out.println("Do you have ticket");
        String ticket=input.nextLine();
        System.out.println("Do you have passport");
        String passport=input.nextLine();
        System.out.println("How much money do you have");
        int money=input.nextInt();
        boolean ticketHave=ticket.equalsIgnoreCase( "yes" );
        boolean passportHave=passport.equalsIgnoreCase( "yes" );
        if (ticketHave&&passportHave&&money>=200) {
            System.out.println( "You can go everywhere" );
        }else if(passportHave==false&& money>=200&& ticketHave){
            System.out.println("You need passport");
        }else if (passportHave&&money>=200&&ticketHave==false){
            System.out.println("You need ticket");
        }else if(money<200){
                money=200-money;
                System.out.println("You need more $"+money);
        }else{
            System.out.println("You can not go anywhere");
        }
    }
}
