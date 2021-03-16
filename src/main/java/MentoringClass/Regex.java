package MentoringClass;

public class Regex{
    public static void main(String[] args){
        String letterL="l";
        String letterUp="L";
        String specialChar=",";
        String number="8";
        String anyChar=".";
//        System.out.println(letterL.matches(anyChar));
//        System.out.println(letterUp.matches(anyChar));
//        System.out.println(specialChar.matches(anyChar));
//        System.out.println(number.matches(anyChar));

        String str="techtorial";
        String regexChr=".*t.*t.*";
      //  System.out.println(str.matches(regexChr));


        String anyLetter="[a-zA-Z]*";
        System.out.println(str.matches(anyLetter));

        String phone="332-563-4321";
        String regexForm="[0-9]{3}-[0-9]{3}-[0-9]{4}";
        System.out.println(phone.matches(regexForm));

        String regexForDoesntContain="";
    }
}