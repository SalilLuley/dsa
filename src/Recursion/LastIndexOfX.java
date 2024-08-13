package Recursion;

public class LastIndexOfX {
    public static void main(String[] args) {
        int[] arr = new int[] {2};
        int result = lastIndex(arr, 2);
        System.out.println(result);
    }

    public static int lastIndex(int[] input, int x) {
        return lastIndex(input, x, 0, -1);
    }

    public static int lastIndex(int[] input, int x, int startIndex, int firstIndex) {
        if(startIndex >= input.length -1) {
            return input[startIndex] == x ? startIndex : firstIndex;
        }

        if(input[startIndex] == x) {
            firstIndex = startIndex;
        }

        return lastIndex(input, x, startIndex +1,firstIndex);
    }
}
