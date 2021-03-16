package String;

public class LowerUpperCase{
    public static void main(String[] args){


        String success="Doing WhatEverItTakes";
        success.toUpperCase();
        success=success.toUpperCase();
        System.out.println(success);
        success=success.toLowerCase();
        System.out.println(success);
        System.out.println(success.startsWith( "d" ));
        System.out.println(success.endsWith( "S" ));
        System.out.println(success.endsWith( "takes" ));
        System.out.println(success.contains( "it" ));

        String multiply="multiple";
        System.out.println(multiply.equals( "multiple" ));
        System.out.println(multiply.equalsIgnoreCase( "MULTIPLE" ));

        System.out.println(success.substring( 2,8 ));
        System.out.println(success.substring( 5 ));
    }
}