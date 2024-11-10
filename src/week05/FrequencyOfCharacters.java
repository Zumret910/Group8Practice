package week05;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        System.out.println("AAABBCDD");
    }


    public static String Chars (String str){
        //initialize and empty string to store

        String result ="";

        // first character
        while ( str.length ()>0){
            char currentChar= str.charAt(0);
            int count = 0;

            //loop for string count
            for (int i=0; i<str.length(); i++){
                if (str.charAt(i)== currentChar){
                    count++;
                }
            }
            // concat. char
            result+= currentChar+ String.valueOf(count);
            str = str.replaceAll(Character.toString(currentChar),"");
        }
        return result;

    }




}
