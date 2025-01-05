package Recursion;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4};
        boolean result = checkIsSorted(arr);
        System.out.println(result);
    }

    public static  boolean checkIsSorted(int[] input) {
        return  checkIsSorted(input, 0);
    }

    public  static  boolean checkIsSorted(int[] input, int startIndex) {
        if(startIndex >= input.length - 1) {
            return true;
        }

        if (input[startIndex] > input[startIndex+1]) {
            return false;
        }


        return checkIsSorted(input, startIndex +1 );
    }
}
