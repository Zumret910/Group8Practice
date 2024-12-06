package week08;

public class Zumret_Reverse {
//    Write a return method that can reverse  String
//    Ex: Reverse("ABCD"); ==> DCBA
    public static String reverse1(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    public static String reverse2(String str){
        String result="";
        for (int i = str.length()-1; i >=0; i--) {
            result+=str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverse1("ABCD"));
        System.out.println(reverse2("ABCD"));
    }
}

