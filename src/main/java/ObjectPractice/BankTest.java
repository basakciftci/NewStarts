package ObjectPractice;

public class BankTest{
    public static void main(String[] args){
        BankAccount account=new BankAccount();
        account.personName="Basak";
        account.bankName="Chase";
        account.accountNumber=123456;
        account.accountOpenDate="10/10/2018";
        account.userName="basakciftci";
        account.password="89basak";
        account.display();
        account.deposit( 1000 );
        account.withdraw( 400 );
        account.withdraw( 300 );
        System.out.println("The balance is "+account.balance);

    }
}
