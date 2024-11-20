package week05;

import java.util.*;

public class Ivan_RemoveDuplicates {

    public static void main(String[] args) {

        System.out.println(removeDuplicates("AAABBBCCC"));
        System.out.println(removeDuplicates_Set("AAABBBCCC"));
    }

    public static String removeDuplicates(String str) {

        String result = "";

        String[] chars = str.split("");

        for (int i = 0; i < chars.length; i++) {

            if ( ! result.contains(chars[i])) {
                result += chars[i];
            }
        }
        return result;
    }

    public static String removeDuplicates_Set(String str) {

        Set<String> set = new LinkedHashSet<>(List.of(str.split("")));

        return String.join("", set);
    }
}
/*
Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC")  ==> ABC
 */