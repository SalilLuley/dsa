package Recursion;

public class ReplacePi {
    public static void main(String[] args) {
        String result = replace("xpix");
        System.out.println(result);
    }

    public static String replace(String input){
        return replace(input, 0);
    }

    public static String replace(String input, int startIndex){
        if(startIndex >= input.length() - 1) {
            return input;
        }

        if(input.charAt(startIndex) == 'p' && input.charAt(startIndex + 1) == 'i') {
            String start = input.substring(0, startIndex);
            String end = input.substring(startIndex+2);
            input = start + "3.14" + end;
            startIndex+=3;
        }

        return replace(input, startIndex+1);
    }
}
