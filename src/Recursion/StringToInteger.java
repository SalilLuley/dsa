package Recursion;

public class StringToInteger {
    public static void main(String[] args) {
        int result = convertStringToInt("12567");
        System.out.println(result);
    }


    public static int convertStringToInt(String input){
        return convertStringToInt(input, 0, 0, false);
    }

    public static int convertStringToInt(String input, int startIndex, int output, boolean encounteredNumber){
        // Write your code here
        if(startIndex >= input.length()) {
            return output;
        }

        if(input.charAt(startIndex) - '0' > 0 && !encounteredNumber) {
            encounteredNumber = true;
        }

        if (encounteredNumber) {
            output = output * 10 + input.charAt(startIndex) - '0';
        }

        return convertStringToInt(input, startIndex + 1, output, encounteredNumber);
    }
}
