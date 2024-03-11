public class Palindrome {

    public static void main(String[] args){
        int num = 122231;
        int org = num;

        int rev = 0;
        while (num>0){
            rev = rev*10 + num%10;
            num = num/10;
        }


        if (rev==org){
            System.out.println(rev+" is a palindrome");

        }
        else {
            System.out.println(rev+" is not a palindrome");
        }
    }
}
