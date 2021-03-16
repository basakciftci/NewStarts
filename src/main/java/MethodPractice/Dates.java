package MethodPractice;

public class Dates{
    public static String convertDate(String date ){
        date=date.replace("-","/");
        String dateTime=date.substring(0,date.indexOf("T"));
        System.out.println(dateTime);
        return dateTime;
    }
    public static String convertDate1(String date){
        String arr[]=date.split("T");
        date=arr[0].replace("-","/");
        System.out.println(date);
        return date;
    }

    public static void main(String[] args){
        convertDate("03-6-2018T00:23");
        convertDate1("03-6-2018T00:23");
    }
}
