package week05;

import java.util.*;

public class Zumret {
    ////Write a return method that can find the frequency of characters
    ////Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
    public static String FrequencyOfChars(String str) {
        String result="";
        for(int i=0; i<str.length(); i++){
            int count=0;
            if (!result.contains(str.charAt(i)+"")){
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            result+=str.charAt(i)+""+count;
            }

        }
        return result;
    }

    public static String frequencyCollections(String str) {
        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        String result="";
        for (String each : list) {
            int cont = Collections.frequency(list, each);
            if (!result.contains(each+"")){
                result+=each+""+cont;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(FrequencyOfChars("AAABBCDD"));
        System.out.println(frequencyCollections("AAABBCDD"));// Output: A3B2C1D2
    }
}
