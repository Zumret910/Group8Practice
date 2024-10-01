package practice3;

public class IvanR {

    public static void main(String[] args) {

        swapNumbers(11, 22);

    }

    public static void swapNumbers(int num1, int num2) {

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
