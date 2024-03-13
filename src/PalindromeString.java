public class PalindromeString {

    public static void main(String[] args){
        String name = "rajeev";
        String org = name;
        String rev = "";

        for (int i =name.length()-1;i>=0;i--){
            rev = rev + name.charAt(i);
        }

        if(org.equals(rev)){
            System.out.println(rev+" is a plaindrome");
        }
        else {
            System.out.println(rev+" is not a plaindrome");
        }
    }
}
