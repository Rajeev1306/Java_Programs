public class LargetsNumber {
    public static void main(String[] args) {
        int a=7,b=9,c=2;

        if(a>b && a>c){
            System.out.println(a+" is the largest");
        }
        else if (b>a && b>c){
            System.out.println(b+" is the largest");
        }
        else{
            System.out.println(c+" is the largest");
        }
    }
}
