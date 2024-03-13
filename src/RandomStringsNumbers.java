import java.util.Random;

public class RandomStringsNumbers {
    public static void main(String[] args) {
        Random r = new Random();
        String data="";
        int length=10;
        for(int i=0;i<length;i++)
        {
            data = data + (char)(r.nextInt(26)+97) + (char)(r.nextInt(26)+65);
        }
        System.out.println(data);
    }
}
