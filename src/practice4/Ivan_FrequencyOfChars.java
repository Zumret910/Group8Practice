package practice4;

import java.util.LinkedHashMap;
import java.util.Map;

public class Ivan_FrequencyOfChars {

    public static void main(String[] args) {

        System.out.println("charFrequency(\"AAABBCDD\") = " + charFrequency("AAABBCDD"));

        System.out.println("charFrequency_MAP(\"AAABBCDD\") = " + charFrequency_MAP("AAABBCDD"));

    }
    public static String charFrequency(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            int freq = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    freq++;
                }
            }
            if ( ! result.contains("" + str.charAt(i))) {
                result += "" + str.charAt(i) + freq;
            }
        }
        return result;
    }

    public static String charFrequency_MAP(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {

            Character ch = str.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        return map.toString();
    }
}
/*
//Write a return method that can find the frequency of characters
//Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */