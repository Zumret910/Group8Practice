package week06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sofiia1 {
   // removeDupes
   public static void main(String[] args) {
       System.out.println(Arrays.toString(removeDupes(new int[]{1, 1, 1, 3, 5, 5, 7, 7, 4, 9, 2, 2})));
       System.out.println(removeDupes("AAABBBCCCDDD"));
   }

    public static int[] removeDupes(int[]dupe){
        Set<Integer> noDupes = new HashSet<>();
        for(int i = 0; i < dupe.length; i++){
            noDupes.add(dupe[i]);

        }
      return noDupes.stream().mapToInt(i -> i).toArray();
    }

    public static String removeDupes(String s) {
       String noDupes = "";
       for (int i = 0; i < s.length(); i++) {
           char tmp = s.charAt(i);
           if (!noDupes.contains(s.charAt(i)+"")){
               noDupes += tmp;
           }
               }

    return noDupes;
}
}
