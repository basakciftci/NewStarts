package WhileLoopPractice;

public class WhileLoop{
    public static void main(String[] args){
        int times=5;
        int count=0;
        while(count<times){
            System.out.println("Muammer");
            count++;
        }
        String name="Muammer";
        int indexNum=0;

        while (indexNum<=name.length()-1){
            System.out.println(name.charAt( indexNum ));
            indexNum++;
        }
        System.out.println("===============================");

        String myName="Basak";
        int index=1;
        String reverse="";

        while (index<=myName.length()){
            reverse=""+myName.charAt( myName.length()-index );
            System.out.println(reverse);
            index++;

        }

        String str="Muammer";
        int strIndex=str.length()-1;
        while (strIndex>=0){
            System.out.println(str.charAt( strIndex ));
            strIndex--;
        }
        System.out.println("------------------");

        int num=980745232;
        int sum=0;
        while(num>0) {

            int temp=num%10;
            num=num/10;
            sum+=temp;
        System.out.println(temp);

    }
        System.out.println(sum);
    }
}
