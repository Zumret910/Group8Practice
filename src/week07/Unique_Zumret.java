package week07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unique_Zumret {
//    Write a return  method that can find the unique characters from the String
//    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
    public static String unique(String str) {
        List<String> strList = new ArrayList<>(Arrays.asList(str.split("")));
        strList.removeIf(p -> Collections.frequency(strList, p) > 1);
        return String.join("", strList);
    }
    public static String unique2(String str){
        String result="";
        for (Character each: str.toCharArray() ){
            if (str.indexOf(each) == str.lastIndexOf(each)) {
                result+=each;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(unique("AAABBBCCCDEF")); // Output: DEF
        System.out.println(unique2("AAABBBCCCDEF"));
    }

}
