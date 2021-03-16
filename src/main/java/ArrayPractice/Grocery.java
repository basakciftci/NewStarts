package ArrayPractice;

public class Grocery{
    public static void main(String[] args){
        String [][] grocery={{"Watermelon","Apple","Banana"},
                {"Beans","Lettuce","Cabbage","Onion","Potato","Cucumber"},
                {"Juice","Pepsi","Water","Lemonate"}};

        for (String[] str:grocery){
            for (String grc:str){
                System.out.println(grc);
            }
        }
    }
}
