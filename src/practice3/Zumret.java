package practice3;

public class Zumret {
    //swapTwoNumbers:
    //Swap two int variables' values without using a third variable
    public static void swapTwoNumbers(int a, int b) {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }

    public static void main(String[] args) {
        swapTwoNumbers(23,44);
    }
}
