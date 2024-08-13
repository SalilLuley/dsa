package Recursion;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String result = removeConsecutiveDuplicates("xxxyyyzwwzzz");
        System.out.println(result);
    }

    public static String removeConsecutiveDuplicates(String s) {
        // Write your code here
        return removeConsecutiveDuplicates(s, "");
    }

    public static String removeConsecutiveDuplicates(String s, String output) {

        if (s.length() == 1) {
            output+= s.charAt(0);
            return output;
        }


        if(s.charAt(0) != s.charAt(1)) {
            output += s.charAt(0);
        }

        return removeConsecutiveDuplicates(s.substring(1), output);
    }
}
