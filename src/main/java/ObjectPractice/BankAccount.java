package ObjectPractice;

public class BankAccount{
    String personName;
    String bankName;
    int accountNumber;
    double balance;
    String accountOpenDate;
    String userName;
    String password;
    boolean islogin=false;
    public void display(){
        if (islogin==true){
        System.out.println("Person name "+personName);
        System.out.println("Bank name "+bankName);
        System.out.println("Account number "+accountNumber);
        System.out.println("Balance "+balance);
        System.out.println("Account open date "+accountOpenDate);
        System.out.println("Username and password "+userName+" "+ password);}
        else{
            System.out.println( "please login");
        }
    }
    public double deposit(double deposit){
        if (islogin) {
            balance+=deposit;
        }else {
            System.out.println("Please first login");
        }
        return balance;
    }
    public double withdraw(double withdraw){
        if (islogin){


        if (balance>=withdraw){
            balance-=withdraw;
        }else{
            System.out.println("You can not withdraw the money ");
        }
            }else {
            System.out.println("Please first login");
    }
        return balance;
    }
    public boolean login(String uName,String pword){
        if (userName.equals(uName  )&& password.equals( pword )){
            System.out.println("Welcome to the "+bankName);
            System.out.println("You have successfully signed to the your account ");
            display();
            islogin=true;
            return islogin;
        }else {
            System.out.println("Your username or password is incorrect. Please try later.");
        }
        return islogin;
    }
    public void signUp(String personName,int accountNumber,double balance,
                       String userName,String password, String accountOpenDate){
        this.personName=personName;
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.userName=userName;
        this.password=password;
        this.accountOpenDate=accountOpenDate;

    }
    public void getInstruction(){
        System.out.println("the display info click 0");
        System.out.println("to deposit money click 1");
        System.out.println("to withdraw money click 2");
        System.out.println("to signup click 3");
        System.out.println("to login click 4");
        System.out.println("to exit press 5");
    }

}
