package practice4;

public class Ivan_FrequencyOfChars {

    public static void main(String[] args) {

        System.out.println("charFrequency(\"AAABBCDD\") = " + charFrequency("AAABBCDD"));

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
}
/*
//Write a return method that can find the frequency of characters
//Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */