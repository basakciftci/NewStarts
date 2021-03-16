package ConstructorPractice;

public class AmazonTest{
    public static void main(String[] args){
        Amazon.navigate( TestData.url );
        Amazon.login( TestData.userName,TestData.password );
        Amazon.search( TestData.item );



    }
}
