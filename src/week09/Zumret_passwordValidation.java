package week09;

public class Zumret_passwordValidation {
    //    Password Validation Task:
//    Write a return method that can verify if a password is valid or not.
//    Requirements:
//            1. Password MUST be at least have 6 characters and should not contain space
//    2. Password should at least contain one upper case letter
//    3. Password should at least contain one lowercase letter
//    4. Password should at least contain one special characters
//    5. Password should at least contain a digit
//    if all requirements above are met, the method returns true, otherwise returns false
    public static boolean validatePassword(String password) {
        boolean validPassword = false;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        if (password.length() >= 6 && !password.contains(" ")) {
            for (Character each : password.toCharArray()) {
                if (Character.isDigit(each)) {
                    hasDigit = true;
                } else if (Character.isUpperCase(each)) {
                    hasUpperCase = true;
                } else if (Character.isLowerCase(each)) {
                    hasLowerCase = true;
                } else if (!Character.isLetterOrDigit(each)) {
                    hasSpecialChar = true;
                }
                if (hasSpecialChar && hasDigit && hasLowerCase && hasUpperCase) {
                    validPassword = true;
                    break;
                }
            }
        }
        return validPassword;}


        public static void main (String[]args){
            String password = "Abc123!5as";
            System.out.println("Is Password Valid? " + validatePassword(password));

        }
}

