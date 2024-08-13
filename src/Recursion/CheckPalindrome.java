package Recursion;

public class CheckPalindrome {
    public static void main(String[] args) {
        boolean result = isPalindrome("racecar");
        boolean result1 = isPalindrome("racecara");
        System.out.println(result + " " + result1);
    }

    public static boolean isPalindrome(String str) {
        return isPalindrome(str, 0, str.length() - 1);
    }

    public static boolean isPalindrome(String str, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return true;
        }

        if (str.charAt(startIndex) != str.charAt(endIndex)) {
            return false;
        }

        return isPalindrome(str, startIndex + 1, endIndex - 1);
    }
}
