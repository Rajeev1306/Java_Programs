public class SumofArray {
    public static void main(String[] args) {
        int[] arr = {4,5,7,9,22};
        int temp=0;

        for (int i=0;i<arr.length;i++){
            temp=temp+arr[i];
        }
        System.out.println("Sum of array is "+temp);
    }
}
