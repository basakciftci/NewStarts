package String;

public class StringMethods{
    public static void main(String [] args){
        String lengthofValue="This method will give length of the string";
        int result=lengthofValue.length();
        System.out.println(result);
        System.out.println(lengthofValue.charAt(result-1));
        System.out.println(lengthofValue.charAt( 2 ));
        System.out.println(lengthofValue.charAt( (result-1)/2 ));//middle char from string
        String bookname="Potential";
        bookname=bookname.concat( " of the Class");
        System.out.println(bookname);
        String soccerPlayer="Christiano";
        soccerPlayer.concat( "Ronaldo" );
        System.out.println(soccerPlayer);//Christiano

        String computer="Macbook";
        System.out.println(computer.indexOf( 'b' ));//3
        System.out.println("b");//3
        System.out.println(computer.indexOf( "book" ));//3
        System.out.println(computer.indexOf( "e" ));//-1
        String computer2="Macbook Computer";
        System.out.println(computer2.indexOf( "o",7 ));

    }
}
