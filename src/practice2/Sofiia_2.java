package practice2;

public class Sofiia_2 {
    public static void main(String[] args) {
        Finra(75);
    }

    public static int Finra(int n) {
        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0&&i % 5 == 0) {
                System.out.println("FINRA");
            }else if (i % 3 == 0) {
                System.out.println("FIN");
            }else if (i % 5 == 0) {
                System.out.println("RA");
            }else {
                System.out.println(i);
            }

        }
        return n;
    }
}
