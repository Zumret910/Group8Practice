package src.practice1;

import java.util.Scanner;

public class EvenOrOdd {
        public static String identify(int number) {
            if (number % 2 == 0) {
                return "Even";
            } else {
                return "Odd";
            }
        }
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            scanner.close();

            // Call the identify method and print the result
            System.out.println("The number " + number + " is " + identify(number));
        }
    }


