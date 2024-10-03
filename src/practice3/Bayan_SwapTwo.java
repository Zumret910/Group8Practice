public class Bayan_SwapTwo {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
/*
Assignment #3:
swapTwoNumbers:
Swap two int variables' values without using a third variable.
 */
