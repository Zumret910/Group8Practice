package week06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sofiia1 {
   // removeDupes
   public static void main(String[] args) {
       System.out.println(Arrays.toString(removeDupes(new int[]{1, 1, 1, 3, 5, 5, 7, 7, 4, 9, 2, 2})));
   }

    public static int[] removeDupes(int...dupe){
        Set<Integer> noDupes = new HashSet<>();
        for(int i = 0; i < dupe.length; i++){
            int temp = dupe[i];
            for(int j = i+1; j < dupe.length; j++){

                if(temp == dupe[j]){
                continue;
                }
                noDupes.add(temp);
            }

        }
      return noDupes.stream().mapToInt(i -> i).toArray();
    }
}
