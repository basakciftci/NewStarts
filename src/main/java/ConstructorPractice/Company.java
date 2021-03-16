package ConstructorPractice;

public class Company{
    String name;
    String location;
    String businessType;
    int employeeNum;
    int yearlyBudget;
    public Company(String name, String location,String businessType,int employeeNum,int yearlyBudget){
        this.name=name;
        this.location=location;
        this.businessType=businessType;
        this.employeeNum=employeeNum;
        this.yearlyBudget=yearlyBudget;
    }public void display(){
        System.out.println(name);
        System.out.println(businessType);
        System.out.println(employeeNum);
        System.out.println(location);
        System.out.println(yearlyBudget);
    }

    public static void main(String[] args){
        Company company=new Company( "Apple","Chicago","phone",100,250000 );
        Company a=new Company( "Walgreens","Illionis","Pharmacy",100,10000 );
        company.display();
        a.display();
    }
}
