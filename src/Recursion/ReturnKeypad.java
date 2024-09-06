package Recursion;

import java.util.Arrays;

public class ReturnKeypad {
    public static void main(String[] args) {
        String[] result = keypad(234);
        System.out.println(Arrays.toString(result));
    }

    public static String[] keypad(int n) {
        String [] output = new String[]{};
        if(n == 0 || n == 1) {
            return new String[]{""};
        }
        while (n != 0)
        {
            int digit = n % 10;
            n = n /10;
            String result = helperKeypad(digit);
            String[] ans  =  findCombinations(result);
            String[] arrResult = new String[ans.length*output.length];
            int counter = 0;
            if (output.length == 0) {
                output = new String[ans.length];
                for (int i = 0; i < ans.length; i++) {
                    output[i] = ans[i];
                }
            } else {
                for (int j = 0; j < output.length; j++) {
                    for (int i = 0; i < ans.length; i++) {
                        arrResult[counter] = ans[i] + output[j];
                        counter++;
                    }
                }
            }

            if (arrResult.length != 0 ) {
                output = arrResult;
            }
        }
        return  output;
    }

    public static String[] findCombinations(String input) {
        if (input.isEmpty()) {
            String ans[] = {""};
            return ans;
        }
        findCombinations(input.substring(1));
        String[]  output = new String[input.length()];
        for (int i = 0; i < input.length(); i++) {
            output[i] =  String.valueOf(input.charAt(i));
        }
        return output;

    }

    public static String helperKeypad(int n) {
        return switch (n) {
            case 2 -> "abc";
            case 3 -> "def";
            case 4 -> "ghi";
            case 5 -> "jkl";
            case 6 -> "mno";
            case 7 -> "pqrs";
            case 8 -> "tuv";
            case 9 -> "wxyz";
            default -> "";
        };
    }
}
