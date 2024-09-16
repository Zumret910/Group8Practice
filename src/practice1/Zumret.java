package practice1;

public class Zumret {
    public static void main(String[] args) {
        System.out.println("Check odd or even method:15 is  "+oddOrEven(15));
        System.out.println("Check odd or even method:5 is  "+oddOrEven(5));
        System.out.println("Check odd or even method:6 is  "+oddOrEven(6));
        System.out.println("Check odd or even method:18 is  "+oddOrEven(18));

    }
    public static String oddOrEven(int num){
       return  (num%2==0)?"Even":"Odd";
    }


}
/*
Numbers -- odd & even
Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"

 */