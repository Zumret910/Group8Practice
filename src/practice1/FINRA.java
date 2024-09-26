public class FINRA {

    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(" " + i);
            }
        }
    }
}

/*
Assignment FINRA:
Write a function that prints out the numbers from 1 to 30:
- for numbers that are a multiple of 3, print "FIN" instead of the number;
- for numbers that are a multiple of 5, print "RA" instead of the number;
- for numbers that are a multiple of both 3 and 5, print "FINRA" instead of the number.
Please complete this task in Practice 2. Before you commit your project, don’t forget to update the master branch and merge it into your branch.
 */