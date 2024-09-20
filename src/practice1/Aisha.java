package practice1;

public class Aisha {
    public static void main(String[] args) {
        System.out.println((Identify(12)));
        System.out.println(Identify(13));
    }

    public static String Identify(int num){
        if(num%2==0){
            return"Even";
        }else {
            return"Odd";
        }
    }
}
