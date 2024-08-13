package Recursion;

public class PairStar {
    public static void main(String[] args) {
        String result = addStars("aaaa");
        System.out.println(result);
    }

    public static String addStars(String s) {
        // Write your code here
        return addStars(s, 0);
    }

    public static String addStars(String s, int startIndex) {
        // Write your code here
        if (startIndex >= s.length() - 1) {
            return s;
        }

        if (s.charAt(startIndex) == s.charAt(startIndex + 1)) {
            String start = s.substring(0, startIndex + 1);
            String end = s.substring(startIndex+1);
            s = start+"*"+end;
            startIndex += 1;
        }

        return addStars(s, startIndex+1);
    }
}
