package practice1;

public class IvanR {

    public static void main(String[] args) {

        oddOrEven(5);
        oddOrEven(4);
    }

    public static void oddOrEven(int num) {

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
/*
1️⃣  Numbers -- odd & even
Write a method that can identify  a given number is even or odd.
 */