package week08;

public class Ivan_ReverseString {

    public static void main(String[] args) {

        System.out.println("reverseString(\"ABCD\") = " + reverseString("ABCD"));

    }
    public static String reverseString(String str) {

        StringBuilder result = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {

            result.append(str.charAt(i));
        }

        return result.toString();
    }
}
/*
Write a return method that can reverse  String
Ex: Reverse("ABCD"); ==> DCBA
 */