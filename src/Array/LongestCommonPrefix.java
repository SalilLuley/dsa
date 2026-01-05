package Array;


import java.util.Arrays;
import java.util.HashMap;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String result = longestCommonPrefix(strs);
        System.out.println(result);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (0 == strs.length){
            return "";
        }

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length-1];

        int i = 0;

        while ( i < first.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        return first.substring(0, i);
    }
}



