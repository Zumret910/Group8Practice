package week07;

public class Remove_Duplicate_hidir {
    public static String removeDup(String str) {
        String result = "";

        for (char ch : str.toCharArray()) {
            if (!result.contains(String.valueOf(ch))) {
                result += ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String input = "AAABBBCCC";
        String output = removeDup(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}


