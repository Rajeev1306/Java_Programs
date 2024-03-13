public class EvenOddDigits {
    public static void main(String[] args) {
        int num =234678900;
        int even=0,odd=0,rev = 0;

        while (num>0){
            rev = rev*10 + num%10;
            if(rev!=0){
                if (rev%2==0) {
                    even++;

                } else {
                    odd++;
                }
            }
            num=num/10;
        }

        System.out.println(even);
        System.out.println(odd);
    }
}
