package practice2;

public class Katth {
    public static void main(String[] args) {
        for(int i= 1; i <=30; i++) {

       System.out.println("----Check if numbers are divisible by 3 and 5----");
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            }else if(i % 3 == 0) {
                System.out.println("FIN");
            }else if(i % 5 == 0) {
                System.out.println("RA");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
