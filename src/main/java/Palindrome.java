public class Palindrome{
    public static boolean palindrome(String str){
        String reversed="";
        for (int i=str.length()-1;i>=0;i--){
            reversed+=str.charAt(i);
        }
        if (reversed.equals(str)){
            return  true;
        }
        return false;
    }
    public static boolean palindrome(int num){
        String nums=""+num;
        String reverse="";
        for (int i=nums.length()-1;i>=0;i--){
            reverse+=nums.charAt(i);
        }
        if (nums.equals(reverse)){
            return true;
        }return false;

    }
    public static boolean isPalindrome(int num){
        String nums=""+num;
        String reverse="";
        for (int i=nums.length()-1;i>=0;i--){
            reverse+=nums.charAt(i);
        }int numRev=Integer.valueOf(reverse);

        if (numRev==num){
            return true;
        }return false;

    }
    public static boolean isPalindromeWhile(int num){
        int origin=num;
        int reversedNum=0;
        while (num>0){
            int digit=num%10;
            num=num/10;
            reversedNum=reversedNum*10+digit;

        }if (reversedNum==origin){
            return true;
        }
        System.out.println(reversedNum);
        return false;
    }

    public static void main(String[] args){
        System.out.println(palindrome("dad"));
        System.out.println(palindrome("civic"));
        System.out.println(palindrome(1234553));
        System.out.println(palindrome(123321));
        System.out.println(isPalindrome(12344321));
        System.out.println(isPalindromeWhile(91019));

    }
}
