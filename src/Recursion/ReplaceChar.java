package Recursion;

public class ReplaceChar {
    public static void main(String[] args) {
        String result = replaceCharacter("abacd", 'a', 'x', "");
        System.out.println(result);
    }

    public  static  String replaceCharacter(String input, char c1, char c2, String ans) {
        if (input.isEmpty()) {
            return ans;
        }

        if (input.charAt(0) == c1) {
            ans += c2;
        } else {
            ans += input.charAt(0);
        }
        return replaceCharacter(input.substring(1), c1,c2, ans);
    }


}
