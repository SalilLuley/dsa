package Problems;

public class Palindrome {
    public static void main(String[] args) {
        int x = 1221;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        int newNumber = 0;
        int temp = x;
        while(x > 0) {
            int k = x % 10;
            newNumber = newNumber * 10 + k;
            x = x / 10;
        }
        return newNumber == temp;
    }
}
