package practice3;

public class Sofiia {
    public static void main(String[] args) {
        Swap(5,10);
    }

    public static void Swap (int a, int b){
        a = a + b;
        b = a-b;
        a = a - b;
        System.out.println("a = " + a+" b = " + b);
        return;
    }
}
