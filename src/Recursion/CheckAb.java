package Recursion;

public class CheckAb {

    public static void main(String[] args) {
        boolean result = checkAB("abbba");
        System.out.println(result);
    }

    public static boolean checkAB(String input) {

        if (input.isEmpty() || (input.length() == 1 && input.charAt(0) != 'b')) {
            return true;
        }

       if (input.charAt(0) == 'a') {
           if (input.charAt(1) == 'a') {
               return checkAB(input.substring(1));
           } else if (input.startsWith("bb", 1)) {
               return checkAB(input.substring(3));
           } else {
               return false;
           }
       }
        return false;
    }

}
