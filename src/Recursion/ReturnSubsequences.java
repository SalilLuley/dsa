package Recursion;

import java.util.Arrays;

public class ReturnSubsequences {
    public static void main(String[] args) {
        String[] result = findSubsequences("ab");
        System.out.println(Arrays.toString(result));
    }

    public static String[] findSubsequences(String str){
        if (str.isEmpty()) {
            String ans[] = {""};
            return ans;
        }

        String[] smallAns = findSubsequences(str.substring(1));
        String ans[] = new String[smallAns.length*2];
        int k =0;
        for (int i = 0; i < smallAns.length; i++) {
            ans[k] = smallAns[i];
            k++;
        }
        for (int i = 0; i < smallAns.length; i++) {
            ans[k] = str.charAt(0)+smallAns[i];
            k++;
        }
        return ans;

    }
}
