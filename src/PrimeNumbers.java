public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println(" Prime numbers between 1-100 ");

        int num =100,count = 0;

        for (int i =2;i<=num;i++){
            for (int j =2;j<i-1;j++){
                if (i%j==0){
                    count++;
                }
            }
            if (count == 0){
                System.out.print(i+" ");
            }
            else {
                count = 0;
            }
        }




    }
}
