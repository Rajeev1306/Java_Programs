
public class SwapTwoNumbers {
    public SwapTwoNumbers() {
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 7;
        System.out.println("Numbers before swapping :  a = " + a + ", b = " + b);
        method1(a, b);
        method2(a, b);
        method3(a, b);
        method4(a, b);
        method5(a, b);
    }

    public static void method1(int a, int b) {
        System.out.println("Numbers after swapping :  a = " + b + ", b = " + a);
    }

    public static void method2(int a, int b) {
        a += b;
        b = a - b;
        a -= b;
        System.out.println("Numbers after swapping :  a = " + a + ", b = " + b);
    }

    public static void method4(int a, int b) {
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("Numbers after swapping :  a = " + a + ", b = " + b);
    }

    public static void method3(int a, int b) {
        a *= b;
        b = a / b;
        a /= b;
        System.out.println("Numbers after swapping :  a = " + a + ", b = " + b);
    }

    public static void method5(int a, int b) {
        int var10000 = a + b;
        a = b;
        b = var10000 - b;
        System.out.println("Numbers after swapping :  a = " + a + ", b = " + b);
    }
}
