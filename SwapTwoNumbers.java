public class SwapTwoNumbers {

    public static void main(String args[]){
        int a = 10, b = 7;

        System.out.println("Numbers before swapping : "+" a = "+a+", b = "+b);

        method1(a,b);
        method2(a,b);
        method3(a,b);
        method4(a,b);
        method5(a,b);


    }

    // Using a temporaray variable
    public static void method1(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Numbers after swapping : "+" a = "+a+", b = "+b);
    }

    //Without using third variable with only '+' & '-'
    public static void method2(int a,int b){
        a = a+b;
        b= a-b;
        a= a-b;
        System.out.println("Numbers after swapping : "+" a = "+a+", b = "+b);
    }

    //Without using third variable with only 'Bitwise XOR '^' where a and b should not be 0
    public static void method4(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("Numbers after swapping : "+" a = "+a+", b = "+b);
    }

    //Without using third variable with only '*' & '/' where a and b should not be 0
    public static void method3(int a,int b){
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("Numbers after swapping : "+" a = "+a+", b = "+b);
    }

    //Using a single statement
    public static void method5(int a,int b){
        b = (a+b) - (a=b);
        System.out.println("Numbers after swapping : "+" a = "+a+", b = "+b);
    }





}
