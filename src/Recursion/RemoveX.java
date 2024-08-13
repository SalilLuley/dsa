package Recursion;

public class RemoveX {
    public static void main(String[] args) {
        String result = removeX("xaxb");
        System.out.println(result);
    }

    public static String removeX(String input){
        // Write your code here
        return  removeX(input,0,  "");
    }

    public static String removeX(String input, int startIndex, String output){
        // Write your code here
        if (startIndex >= input.length()) {
            return output;
        }
        if(input.charAt(startIndex) != 'x') {
            output += input.charAt(startIndex);
        }
        return removeX(input, startIndex+1, output);
    }
}
