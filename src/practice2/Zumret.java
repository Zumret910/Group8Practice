package practice2;

public class Zumret {
    public static void main(String[] args) {
      finraNum(30);

    }
    public static void finraNum(int n){
        for (int i = 1; i <=30 ; i++) {
            String result="";
            if (i % 3 == 0 ) {
                result +="FIN";
            }
            if (i % 5 == 0 ) {
                result +="RA";
            }
            System.out.println((result.isEmpty())?i:result );
        }

    }
}
/*
Write a function that prints out the numbers from 1 to 30 but for numbers that are a multiple of 3, print "FIN" instead of the number, and for numbers that are a multiple of 5, print "RA" instead of the number. For numbers that are a multiple of both 3 and 5, print "FINRA" instead of the number.
 */
