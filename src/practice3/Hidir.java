package practice3;

public class Hidir {
    public class SwapTwoNumbers {
        public static void main(String[] args) {
            int a = 20;
            int b = 30;

            // Swap logic
            a = a + b; // a becomes 50
            b = a - b; // b becomes 20 (original value of a)
            a = a - b; // a becomes 30 (original value of b)

            // Output the swapped values
            System.out.println("a = " + a); // a = 30
            System.out.println("b = " + b); // b = 20
        }
    }
}
